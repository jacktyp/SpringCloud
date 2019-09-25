package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author taoyunpeng
 * @description name为服务提供者向注册中心注册的实例名
 * @date 2019/9/20 9:34
 */
@FeignClient(value = "provide-str", fallbackFactory = TestFallbackFactory.class)
public interface FeignClientTest {

    /**
     * 地址为服务提供者对外暴露的地址
     * @return
     */
    @GetMapping("get")
    String getStr();
}
