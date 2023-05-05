package com.example.demo.kata.injectFilter.condition.impl;

import com.example.demo.kata.injectFilter.condition.PassCondition;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(10)
@Component
public class EmptyRequest implements PassCondition {

    @Override
    public boolean isPass(String request) {
        return request.isEmpty();
    }
}
