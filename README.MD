### SpringBoot 项目优化
        启动优化，并不是运行时优化
    - 默认tomcat容器修改为Undertow（JBoss）
        tomcat吞度量在5000  左右
            参数调优
        Undertow 吞吐量 8000左右
    - 
    
    
 #### 日常工作中工具分享
    ##### zkui
        - 一款比较好用的zk管理工具。如果使用zk作为配置中心的话，这个工具很好用（java api的操作，可以看看源码）
        - https://github.com/DeemOpen/zkui.git
    ##### config-toolkit
        - 分布式配置中心
            也是当当开源的一款工具包，可以使用zk作为配置中心
            https://github.com/dangdangdotcom/config-toolkit
     ##### sharding-sphare
        - 当当开源的分库分表中间件，现在已经交由apache进行维护了
     
     ##### elastic-job
        - 当当开源的分布式作业中间件
     ##### xxl-job
        - 这是个人开源的分布式作业中间件，还没有尝试过，尝试之后总结
     ##### Apollo
        - 携程开源的一个配置中心  ，功能比较多，支持灰度发布。但是一来eureka
     ##### arthas
        - 阿里开源的一个线上问题定位工具，比较好用。定位问题优化api有很大的帮助   
                             