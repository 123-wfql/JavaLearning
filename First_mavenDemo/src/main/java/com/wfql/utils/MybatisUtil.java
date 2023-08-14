package com.wfql.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wfql
 * @date 2023/8/4/004
 * @apiNote
 */
public class MybatisUtil {
    public static SqlSession getSqlSessionFromXml(String xmlFileName) {
        // 1.输入流加载mybatis配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(xmlFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2.通过输入流创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3.通过工厂打开会话
        return factory.openSession();
    }
}
