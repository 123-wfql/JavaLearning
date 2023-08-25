package com.wfql.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author wfql
 * @date 2023/8/12/012
 * @apiNote
 */
@Data
@Component
public class Login {
    private int loginId;
    private String loginPwd;
    private int userId;

    private Users user;
}
