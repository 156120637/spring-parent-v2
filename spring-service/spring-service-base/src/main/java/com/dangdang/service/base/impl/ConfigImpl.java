package com.dangdang.service.base.impl;



import com.alibaba.fastjson.JSONObject;
import com.dangdang.config.service.ConfigGroup;
import com.dangdang.service.base.Config;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import java.util.List;


@Slf4j
public class ConfigImpl implements Config {

    private List<ConfigGroup> groups;

    /**
     * 获取配置字符串
     * @param key
     * @return
     */
    @Override
    public String getConfigStr(String key) {
        if(StringUtils.isNotEmpty(key)){
            try{
                String value = null;
                for(ConfigGroup croup : groups){
                    if((value = croup.get(key)) != null){
                        return  value;
                    }
                }
            }catch (Exception e){
                log.error(e.getMessage(),"----getConfigStr----error--");
            }
        }
        return null;
    }
    /**
     * 获取整型值
     * @param key
     * @return 如果value是非整型字符串，则返回null
     */
    @Override
    public Integer getConfigInt(String key) {
        String value =getConfigStr(key);
        if(StringUtils.isNotEmpty(value)){
            try{
                return  Integer.valueOf(value);
            }catch (NumberFormatException e){
                log.error("------ConfigImpl.getConfigInt(String key)---error--------",e.getMessage());
            }
        }
        return null;
    }
    /**
     * 获取JSON对象集合
     * @param key
     * @return  如果key不存在或者value是非json格式的字符串,则返回null
     */
    @Override
    public List<JSONObject> getConfigList(String key) {
        String value = getConfigStr(key);
        List<JSONObject> list = null;
        try{
            list = value != null? JSONObject.parseArray(value.toString(), JSONObject.class) : null;
        }catch (Exception e){
            log.error("-----getConfigList---error---",e.getMessage());
        }
        return list;
    }

    public List<ConfigGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ConfigGroup> groups) {
        this.groups = groups;
    }
}
