package com.dangdang.storage.sharding.domain;

import lombok.Data;

import java.util.Date;

/**
 * Create by tianjiaqin 2019/6/10-19-17
 */
@Data
public class CustomerDetail {
    private Integer custId;
    private String custHeadImg;
    private Integer custSex;
    private Integer custSexShow;
    private Date custBirthday;
    private Integer custBirthdayShow;
    private Integer custAddress;
    private Integer custAddressShow;
    private String custInterest;
    private Integer custInterestShow;
    private String custIntroduce;
    private Integer custIntroduceShow;
    private String custBlog;
    private Integer custBlogShow;
    private String custJobType;
    private String custJob;
    private Integer custJobShow;
    private String custLifeStyle;
    private Integer custLifeStyleShow;
    private Date creationDate;
    private Date lastChangedDate;
}
