package com.dangdang.api.controller;

import com.dangdang.api.dto.LoginForm;
import com.dangdang.api.service.LoginService;
import com.dangdang.common.exception.BaseException;
import com.dangdang.common.utils.ValidateUtils;
import com.dangdang.common.utils.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Api(description = "登录")
@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

    @Autowired
    private ValidateUtils validateUtils;

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "邮箱、用户名登录", notes = "邮箱、用户名登录", httpMethod = "GET")
    @RequestMapping(value = "/Login.php", method = {RequestMethod.GET, RequestMethod.POST})
    public Object login(HttpServletRequest request, @RequestBody LoginForm form, BindingResult br) throws BaseException {

        validateUtils.check(request, form, LoginForm.class, br);

        return this.result(loginService.login(form));
    }

}
