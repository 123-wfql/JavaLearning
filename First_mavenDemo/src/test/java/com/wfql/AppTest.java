package com.wfql;

// import junit.framework.Test;

import com.wfql.dao.LoginMapper;
import com.wfql.dao.UsersMapper;
import com.wfql.entity.Login;
import com.wfql.entity.Users;
import com.wfql.service.LoginService;
import com.wfql.service.UsersService;
import com.wfql.utils.MybatisUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testGetAllUsers() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            List<Users> users1 = mapper.getAllUsers();
            for (Users user : users1) {
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testGetUsersByName() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            List<Users> users2 = mapper.getUsersByName("tom");
            for (Users tom : users2) {
                System.out.println(tom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    //    public void testGetUsersByNameAndPwd() {
    //        SqlSession sqlSession  = MybatisUtil.getSqlSessionFromXml();
    //        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
    //        try{
    //            List<Users> users3 = mapper.getUsersByNameAndPwd("tom", "123456");
    //            for(Users tom : users3){
    //                System.out.println(tom);
    //            }
    //        } catch (Exception e){
    //            e.printStackTrace();
    //        }
    //
    //
    //
    //        sqlSession.close();
    //
    //
    //    }

    public void testGetUsersByUsers() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            Users queryUser = new Users();
            queryUser.setName("tom");
            List<Users> users4 = mapper.getUsersByUsers(queryUser);
            for (Users tom : users4) {
                System.out.println(tom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testGetUsersBySearch() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            String word = "张%";
            List<Users> users5 = mapper.getUsersBySearch(word);
            for (Users tom : users5) {
                System.out.println(tom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testAddUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            // 获取当前表中记录个数
            int count = mapper.getItemsCount();
            System.out.println(count);
            Users users = new Users();
            users.setId(count + 1);
            users.setName("wfql");
            int i = mapper.addUser(users);
            System.out.println("添加了" + i + "条数据");

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testDeleteUsers() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            int j = mapper.deleteUsers(8);
            sqlSession.commit();
            System.out.println("删除了" + j + "条数据");
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testUpdateUsers() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class); // 调用findAll方法查询数据库
        try {
            Users users7 = new Users();
            users7.setId(5);
            users7.setName("chen");
            int k = mapper.updateUser(users7);
            sqlSession.commit();
            System.out.println("修改了" + k + "条数据");
        } catch (Exception e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    public void testGetAllLogin() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        List<Login> logins = mapper.getAllLogin();
        for (Login l : logins) {
            System.out.println(l);
        }
    }

    public void testGetAllUsersAndLogins() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> users = mapper.getAllUsersAndLogins();
        for (Users u : users) {
            System.out.println(u);
        }
    }

    public void testGetAllLoginByConditions() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        Login queryLogin = new Login();
        queryLogin.setLoginPwd(null);
        queryLogin.setUserId(-1);
        List<Login> logins = mapper.getAllLoginByConditions(queryLogin);
        for (Login l : logins) {
            System.out.println(l);
        }
    }

    public void testDeleteByIds() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(147258);
        int i = mapper.deleteByIds(ids);
        sqlSession.commit();
        if (i > 0) {
            System.out.println("删除了" + i + "条记录");
        } else {
            System.out.println("删除失败");
        }
    }

    public void testDeleteByMap() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(147258);
        Map<String, List> map = new HashMap<>();
        map.put("ids", ids);
        int i = mapper.deleteByMap(map);
        sqlSession.commit();
        if (i > 0) {
            System.out.println("删除了" + i + "条记录");
        } else {
            System.out.println("删除失败");
        }
    }

    public void testIOC() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService service = app.getBean("loginService", LoginService.class);
        service.getAllLogin();
        UsersService service1 = app.getBean("usersServiceBySetter", UsersService.class);
        service1.getAllUsers();
    }
}
