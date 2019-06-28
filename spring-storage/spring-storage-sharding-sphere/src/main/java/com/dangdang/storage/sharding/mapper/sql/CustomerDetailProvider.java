package com.dangdang.storage.sharding.mapper.sql;

import com.dangdang.common.utils.sql.BatchInsertSQLBuilder;
import com.dangdang.common.utils.sql.BatchUpdateSQLBuilder;
import com.dangdang.storage.sharding.domain.CustomerDetail;

/**
 * Create by tianjiaqin 2019/6/10-19-28
 */
public class CustomerDetailProvider {


    public String save(CustomerDetail customerDetail) {

        BatchInsertSQLBuilder<CustomerDetail> builder = new BatchInsertSQLBuilder();
        builder.setData(customerDetail);
        builder.setInsertTable("customer_detail");
        builder.setSelective(true);
        return builder.toString();
    }

    public String update(CustomerDetail customerDetail) {
        BatchUpdateSQLBuilder<CustomerDetail> builder = new BatchUpdateSQLBuilder<>();
        builder.setUpdateTable("customer_detail", "cust_id");
        builder.setData(customerDetail);
        builder.setSelective(true);
        return builder.toString();
    }

}
