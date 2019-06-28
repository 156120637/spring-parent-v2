package com.dangdang.storage.sharding.mapper;

import com.dangdang.storage.sharding.domain.Customer;
import com.dangdang.storage.sharding.mapper.sql.CustomerProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Create by tianjiaqin 2019/6/10-19-26
 */
public interface CustomerMapper {

    @InsertProvider(type = CustomerProvider.class , method = "save")
    Integer save(Customer customer);

    @UpdateProvider(type = CustomerProvider.class , method = "update")
    Integer update(Customer customer);

    @Select("select * from customer where cust_id=#{custId}")
    Customer selectByCustID(Integer custId);

    @Select("select * from customer where cust_mobile=#{mobilePhone}")
    Customer selectByMobile(String mobilePhone);

    @Select("select * from customer where cust_email=#{email}")
    Customer selectByEmail(String email);

    @Select("select * from customer where cust_nickname=#{nickName}")
    Customer selectByNickName(String nickName);



}
