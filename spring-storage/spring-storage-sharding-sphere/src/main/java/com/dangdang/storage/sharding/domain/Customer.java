package com.dangdang.storage.sharding.domain;

import lombok.Data;

import java.util.Date;

/**
 * Create by tianjiaqin 2019/6/10-19-16
 */
@Data
public class Customer {
    private Integer custId;
    private String custMobile;
    private String custEmail;
    private String custNickname;
    private Date custRegisterDate;
    private String custRegisterIp;
    private String custRegisterPlat;
    private String custRegisterPlatDetail;
    private Integer custVip;
    private Date custVipStartDate;
    private Date custVipEndDate;
    private String custLoginPass;
    private Integer custEmailVerified;
    private Integer custMobleVerified;
    private Integer custStatus;
    private Date creationDate;
    private Date lastChangedDate;
}
