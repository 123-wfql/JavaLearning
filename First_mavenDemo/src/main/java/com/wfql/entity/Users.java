package com.wfql.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wfql
 * @date 2023/8/4/004
 * @apiNote
 */
@Data
@Component
public class Users {
  private Integer id;
  private String name;

  private List<Login> logins;
}
