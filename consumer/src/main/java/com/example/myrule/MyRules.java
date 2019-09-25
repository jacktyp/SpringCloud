package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/19 17:08
 */
@Configuration
public class MyRules {

    @Bean
    public IRule myselfRule(){
        return new MyGetRule();
    }
}
