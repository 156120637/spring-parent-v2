package com.dangdang.biz.dto;

import lombok.Data;

/**
 * Create by tianjiaqin 2019/5/24-15-14
 */
@Data
public class LoginResult {

    private String token_id;

    private Integer statusCode;
    private Integer errorCode;
}
