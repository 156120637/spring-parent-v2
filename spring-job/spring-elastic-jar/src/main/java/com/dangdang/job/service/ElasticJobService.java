package com.dangdang.job.service;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by tianjiaqin 2019-07-18
 * 自动配置类
 */
@Slf4j
@Component
@ElasticSimpleJob(jobName = "elasticService",
        cron = "*/10 * * * * ?",
        shardingTotalCount = 6,
        shardingItemParameters = "0=zero, 1=one , 2=two,3=three,4=four,5=five")
public class ElasticJobService implements SimpleJob {


    @Override
    public void execute(ShardingContext shardingContext) {


        int shardingItem = shardingContext.getShardingItem();
        int shardingTotalCount = shardingContext.getShardingTotalCount();


        // 根据shardingItem来分配这个作业执行什么， 这个东西可以配置在缓存中加快处理速度。也可以是一个数据库的查询条件等等。


    }
}
