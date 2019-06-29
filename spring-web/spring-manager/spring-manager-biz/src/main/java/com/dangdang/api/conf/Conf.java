package com.dangdang.api.conf;

import lombok.Data;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Create by tianjiaqin 2019/5/15-15-11
 */
@Data
@Component
@PropertySource({"classpath:conf.properties"})
public class Conf {

}
