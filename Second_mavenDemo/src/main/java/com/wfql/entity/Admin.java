package com.wfql.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Integer adminType;
}
