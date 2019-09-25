package com.example.provide.service;

import org.springframework.stereotype.Service;

/**
 * @author taoyunpeng
 * @description
 * @date 2019/9/19 14:28
 */
@Service
public class StrServiceImpl implements StrService {
    @Override
    public String getStr() {
        return "test222 ...";
    }
}
