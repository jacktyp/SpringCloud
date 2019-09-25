package com.example.provide2.controller;

import com.example.provide2.service.StrService;
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
    public String getStr(Integer id){
        return strService.getStr();
    }

}
