package com.dangdang.storage.sharding.mapper.sql;

import com.dangdang.common.utils.sql.BatchInsertSQLBuilder;
import com.dangdang.common.utils.sql.BatchUpdateSQLBuilder;
import com.dangdang.storage.sharding.domain.Customer;

/**
 * Create by tianjiaqin 2019/6/10-19-28
 */
public class CustomerProvider {


    public String save(Customer customer) {

        BatchInsertSQLBuilder<Customer> builder = new BatchInsertSQLBuilder();
        builder.setData(customer);
        builder.setInsertTable("customer");
        builder.setSelective(true);
        return builder.toString();
    }

    public String update(Customer customer) {
        BatchUpdateSQLBuilder<Customer> builder = new BatchUpdateSQLBuilder<>();
        builder.setUpdateTable("customer", "cust_id");
        builder.setData(customer);
        builder.setSelective(true);
        return builder.toString();
    }

}
