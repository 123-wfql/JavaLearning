package com.wfql.factory;

import com.wfql.dao.LoginMapper;
import com.wfql.dao.UsersMapper;
import com.wfql.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

/**
 * @author wfql
 * @date 2023/8/15/015
 * @apiNote
 */
@Component
public class MapperFactory {
    private static SqlSessionFactory sqlSessionFactory;

    public static UsersMapper createUsersMapper() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        return sqlSession.getMapper(UsersMapper.class);
    }

    public static LoginMapper createLoginMapper() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFromXml("mybatis_config.xml");
        return sqlSession.getMapper(LoginMapper.class);
    }
}
