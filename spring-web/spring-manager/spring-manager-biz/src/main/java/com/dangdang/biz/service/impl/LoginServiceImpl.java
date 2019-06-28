package com.dangdang.biz.service.impl;

import com.dangdang.biz.dto.LoginForm;
import com.dangdang.biz.dto.LoginResult;
import com.dangdang.biz.service.LoginService;
import com.dangdang.common.exception.BaseException;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResult login(LoginForm form) throws BaseException {
        return null;
    }
}
