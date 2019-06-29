package com.dangdang.api.dto;

import lombok.Data;

@Data
public class LoginForm {
    /**
     * 用户名
     */
    private String username;
    private String password;
}
