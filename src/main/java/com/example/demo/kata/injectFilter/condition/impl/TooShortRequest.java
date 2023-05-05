package com.example.demo.kata.injectFilter.condition.impl;

import com.example.demo.kata.injectFilter.condition.PassCondition;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class TooShortRequest implements PassCondition {

    private static final int SPECIFIC_INFORMATION = 3;
    @Override
    public boolean isPass(String request) {
        return request.length() < SPECIFIC_INFORMATION;
    }
}
