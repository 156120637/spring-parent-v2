package com.dangdang.biz.service;

import com.dangdang.biz.dto.LoginForm;
import com.dangdang.biz.dto.LoginResult;
import com.dangdang.common.exception.BaseException;

public interface LoginService {

    /**
     * 邮箱、用户名登录
     */
    LoginResult login(LoginForm form) throws BaseException;

}
