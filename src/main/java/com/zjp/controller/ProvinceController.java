package com.zjp.controller;

import com.zjp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/wars",method = RequestMethod.GET)
    public Map getWarZone(){
        return provinceService.getWarZone();
    }

    @RequestMapping(value = "/provinces",method = RequestMethod.GET)
    public Map getProvince(){
        return provinceService.getProvince();
    }
}
