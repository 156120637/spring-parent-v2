package com.dangdang.service.base;

import com.alibaba.fastjson.JSONObject;
import java.util.List;

/**
 *
 */
public interface Config {

    /**
     * 获取配置字符串
     * @param key
     * @return
     */
    public String getConfigStr(String key);
    /**
     * 获取整型值
     * @param key
     * @return
     */
    public Integer getConfigInt(String key);
    /**
     * 获取JSON对象集合
     * @param key
     * @return
     */
    public List<JSONObject> getConfigList(String key);

}
