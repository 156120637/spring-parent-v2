package com.dangdang.biz.service;

import com.dangdang.biz.dto.LoginForm;
import com.dangdang.biz.dto.LoginResult;

public interface LoginService {

    /**
     * 邮箱、用户名登录
     */
    LoginResult login(LoginForm form) ;

}
