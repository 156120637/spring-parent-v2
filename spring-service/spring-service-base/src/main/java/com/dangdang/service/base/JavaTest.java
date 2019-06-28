package com.dangdang.service.base;

import com.dangdang.config.service.GeneralConfigGroup;
import com.dangdang.config.service.zookeeper.ZookeeperConfigGroup;
import com.dangdang.config.service.zookeeper.ZookeeperConfigProfile;


public class JavaTest {

    public static void main(String [] args){
        ZookeeperConfigProfile configProfile = new ZookeeperConfigProfile("10.255.209.45:2181,10.255.209.46:2181,10.255.209.47:2181", "/customer-refactor/common", "1.0.0");
        GeneralConfigGroup group = new ZookeeperConfigGroup(configProfile, "group");

        while(true){
            String stringProperty = group.get("config.str");
//          Preconditions.checkStateState("hello".equals(stringProperty));
            String intProperty = group.get("config.int");
//          Preconditions.checkState(7758 == Integer.parseInt(intProperty));

            System.out.println(stringProperty);
            System.out.println(intProperty);

            try{
                Thread.currentThread().sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
