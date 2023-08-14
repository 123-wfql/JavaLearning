package com.wfql.dao;

import com.wfql.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wfql
 * @date 2023/8/4/004
 * @apiNote
 * 这个类使用了工厂获取，在xml中需要定义bean，不需要对这个接口进行实现
 */
@Mapper
@Repository
// 定义操作数据库的一些方法
public interface UsersMapper {

    List<Users> getAllUsers();

    List<Users> getUsersByName(String name);

    List<Users> getUsersByNameParam(@Param("name") String name);

    List<Users> getUsersByUsers(Users users);

    List<Users> getUsersBySearch(String word);

    int addUser(Users users);

    int deleteUsers(int id);

    int updateUser(Users users);

    int getItemsCount();

    List<Users> getAllUsersAndLogins();
}
