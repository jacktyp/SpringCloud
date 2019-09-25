package com.example.consumer.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/19 15:42
 */
@RestController
public class StrController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String STRURL = "http://provide-str/get";

    @GetMapping("find")
    public String findTest(String name){
        return restTemplate.getForObject(STRURL,String.class);
    }
}
