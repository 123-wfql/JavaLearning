package com.wfql.dao.impl;

import com.wfql.dao.LoginMapper;
import com.wfql.entity.Login;
import com.wfql.utils.MybatisUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author wfql
 * @date 2023/8/15/015
 * @apiNote
 */
@Repository
public class LoginMapperImpl implements LoginMapper {
    @Override
    public List<Login> getAllLogin() {
        return MybatisUtil.getSqlSessionFromXml("mybatis_config.xml").getMapper(LoginMapper.class).getAllLogin();
    }


    @Override
    public List<Login> getAllLoginByConditions(Login login) {
        return MybatisUtil.getSqlSessionFromXml("mybatis_config.xml").getMapper(LoginMapper.class).getAllLoginByConditions(login);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        return MybatisUtil.getSqlSessionFromXml("mybatis_config.xml").getMapper(LoginMapper.class).deleteByIds(ids);
    }

    @Override
    public int deleteByMap(Map<String, List> map) {
        return MybatisUtil.getSqlSessionFromXml("mybatis_config.xml").getMapper(LoginMapper.class).deleteByMap(map);
    }
}
