package com.example.feign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/20 11:24
 */
@Component
public class TestFallbackFactory implements FallbackFactory<FeignClientTest>{
    @Override
    public FeignClientTest create(Throwable throwable) {
        return () -> "service is G";
    }
}
