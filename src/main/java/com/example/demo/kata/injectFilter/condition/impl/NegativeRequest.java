package com.example.demo.kata.injectFilter.condition.impl;

import com.example.demo.kata.injectFilter.condition.PassCondition;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Order(1)
@Component
public class NegativeRequest implements PassCondition {

    private static final String SPECIFIC_INFORMATION = "NO";
    @Override
    public boolean isPass(String request) {
        return Objects.equals(SPECIFIC_INFORMATION, request);
    }
}
