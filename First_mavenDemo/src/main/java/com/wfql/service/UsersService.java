package com.wfql.service;

import com.wfql.dao.UsersMapper;
import com.wfql.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author wfql
 * @date 2023/8/15/015
 * @apiNote
 *
 */
@Service
public class UsersService {

    private UsersMapper usersMapper;

    @Autowired
    public void setUsersMapper(UsersMapper usersMapperByFactory) {
        this.usersMapper = usersMapperByFactory;
    }


    private static final Logger logger = Logger.getLogger(UsersService.class.getName());

    public void getAllUsers() {
        logger.log(Level.INFO, "展示用户信息列表");
        List<Users> users = usersMapper.getAllUsers();
        for (Users u : users) {
            logger.log(Level.INFO, "u = {0}", u);
        }
    }
}
