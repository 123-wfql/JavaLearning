package com.wfql.dao;


import com.wfql.entity.Admin;

import java.util.List;

public interface AdminMapper {

    /*查询所有管理员信息*/
    List<Admin> getAllAdmin();

}
