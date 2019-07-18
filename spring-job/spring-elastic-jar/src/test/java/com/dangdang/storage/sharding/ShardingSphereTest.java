//package com.dangdang.sharding;
//
//
//import Customer;
//import CustomerMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Date;
//
//
//@Slf4j
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = CustomerSphereApplication.class)
//public class ShardingSphereTest {
//
//    @Autowired
//    private CustomerMapper customerMapper;
//
//
//    @Test
//    public void testCustomerMapper(){
//
//        Customer customer = customerMapper.selectByCustID(99183);
//        log.info("customer is {}" , customer);
//
//    }
//
//}
