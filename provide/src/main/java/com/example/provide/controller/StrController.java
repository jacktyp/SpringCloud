package com.example.provide.controller;

import com.example.provide.service.StrService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/19 14:29
 */
@RestController
public class StrController {

    @Autowired
    private StrService strService;

    @GetMapping("get")
    @HystrixCommand(fallbackMethod = "proccessGet")
    public String getStr(Integer id){
        /*if (id == 1){
            throw new RuntimeException("..");
        }*/
        return strService.getStr();
    }

    public String proccessGet(Integer id){
        return "ffffffffffff" + "   "+id;
    }
}
