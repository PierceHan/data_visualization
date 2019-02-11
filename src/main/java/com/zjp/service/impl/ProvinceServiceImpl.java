package com.zjp.service.impl;

import com.alibaba.fastjson.JSON;
import com.zjp.service.ProvinceService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    private String warZone = "{\"code\":\"A0001\",\"data\":{\"titletable\":{\"华南\":\"华南\",\"华东\":\"华东\"," +
            "\"华西\":\"华西\",\"华北\":\"华北\",\"中原\":\"中原\",\"华中\":\"华中\",\"西北\":\"西北\"}," +
            "\"area_type\":\"1\"}}";

    private String province = "{\"code\":\"A0001\",\"data\":{\"titletable\":{\"23\":\"广东\",\"16\":\"浙江\",\"15\":" +
            "\"江苏\",\"1\":\"北京\",\"22\":\"四川\",\"2\":\"上海\",\"10\":\"山东\",\"19\":\"福建\",\"25\":\"云南\"," +
            "\"12\":\"陕西\",\"20\":\"湖北\",\"24\":\"广西\",\"31\":\"海南\",\"21\":\"湖南\",\"9\":\"河南\",\"4\":" +
            "\"重庆\",\"8\":\"河北\",\"7\":\"辽宁\",\"17\":\"安徽\",\"18\":\"江西\",\"26\":\"贵州\",\"11\":\"山西\"," +
            "\"3\":\"天津\",\"5\":\"黑龙江\",\"13\":\"甘肃\",\"6\":" + "\"吉林\",\"28\":\"内蒙古\",\"29\":\"新疆\"," +
            "\"27\":\"青海\",\"14\":\"宁夏\",\"30\":\"西藏\"},\"area_type\":\"2\"}}\n";


    @Override
    public Map getWarZone() {
        return JSON.parseObject(warZone,Map.class);
    }

    @Override
    public Map getProvince() {
        return JSON.parseObject(province,Map.class);
    }
}
