package com.wfql.service;

import com.wfql.dao.AdminMapper;
import com.wfql.entity.Admin;
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
public class AdminService {
    private static final Logger logger = Logger.getLogger(AdminService.class.getName());
//    @Autowired
//    private LoginMapperImpl loginMapperImpl;

    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> getAllAdmins() {
        return adminMapper.getAllAdmin();
    }
}
