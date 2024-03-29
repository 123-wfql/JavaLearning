package com.wfql.service;

import com.wfql.dao.LoginMapper;
import com.wfql.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;


/**
 * @author wfql
 * &#064;date  2023/8/14/014
 * @apiNote
 */
@Service
public class LoginService {
    private static final Logger logger = Logger.getLogger(LoginService.class.getName());
//    @Autowired
//    private LoginMapperImpl loginMapperImpl;

    @Autowired
    private LoginMapper loginMapper;

    public List<Login> getAllLogin() {
        return loginMapper.getAllLogin();
    }
}
