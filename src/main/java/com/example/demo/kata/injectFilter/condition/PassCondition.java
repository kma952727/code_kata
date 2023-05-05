package com.example.demo.kata.injectFilter.condition;

@FunctionalInterface
public interface PassCondition {
    boolean isPass(String request);
}
