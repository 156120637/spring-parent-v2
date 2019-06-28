package com.dangdang.storage.sharding.mapper;

import com.dangdang.storage.sharding.domain.CustomerDetail;
import com.dangdang.storage.sharding.mapper.sql.CustomerDetailProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Create by tianjiaqin 2019/6/10-19-26
 */
public interface CustomerDetailMapper {

    @InsertProvider(type = CustomerDetailProvider.class , method = "save")
    Integer save(CustomerDetail customerDetail);

    @UpdateProvider(type = CustomerDetailProvider.class , method = "update")
    Integer update(CustomerDetail customerDetail);

    @Select("select * from customer_detail where cust_id=#{custId}")
    CustomerDetail findByCustId(Integer custId);
}
