package com.wfql.service;

import com.wfql.dao.LoginMapper;
import com.wfql.dao.impl.LoginMapperImpl;
import com.wfql.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author wfql
 * &#064;date  2023/8/14/014
 * @apiNote
 */
@Service
public class LoginService {
    private LoginMapper loginMapper;


    @Autowired
    public void setLoginMapper(LoginMapperImpl loginMapperImpl) {
        this.loginMapper = loginMapperImpl;
    }

    @Autowired
    public void setLoginMapper(LoginMapper loginMapperByFactory) {
        this.loginMapper = loginMapperByFactory;
    }

    private static final Logger logger = Logger.getLogger(LoginService.class.getName());

    public void getAllLogin() {
        logger.log(Level.INFO, "展示登录信息列表");
        List<Login> logins = loginMapper.getAllLogin();
        for (Login l : logins) {
            logger.log(Level.INFO, "l = {0}", l);
        }
    }
}
