package com.dangdang.api.service;

import com.dangdang.api.dto.LoginForm;
import com.dangdang.api.dto.LoginResult;

public interface LoginService {

    /**
     * 邮箱、用户名登录
     */
    LoginResult login(LoginForm form) ;

}
