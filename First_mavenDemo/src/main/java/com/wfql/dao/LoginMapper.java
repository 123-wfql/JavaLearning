package com.wfql.dao;

import com.wfql.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author wfql
 * &#064;date  2023/8/12/012
 * @apiNote
 * 这个Mapper写了实现类，用注解省略了xml中的配置
 */

@Repository
@Mapper
public interface LoginMapper {

    List<Login> getAllLogin();

    List<Login> getAllLoginByConditions(Login login);

    int deleteByIds(List<Integer> ids);

    int deleteByMap(Map<String, List> map);
}
