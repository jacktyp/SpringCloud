package com.example.feign.controller;

import com.example.feign.service.FeignClientTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/20 9:36
 */
@RestController
public class TestFeignController {

    @Autowired
    private FeignClientTest feignClientTest;

    @GetMapping("/getStr")
    public String getStrs(@RequestParam String param){
        return feignClientTest.getStr() + " ,," + param;
    }
}
