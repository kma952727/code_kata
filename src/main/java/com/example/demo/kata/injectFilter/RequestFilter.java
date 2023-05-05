package com.example.demo.kata.injectFilter;

import com.example.demo.kata.injectFilter.condition.PassCondition;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 1. "통과 조건에 부합하는 요청에 대하여 확인해줘" 메시지 전달
 * 2. "통과 조건"이란 추상적인 정보만 안다. "정확한 통과 조건의 정보"를 모름
 * 3. interface -> usecase -> impl 순서로 구현
 *
 */
@Component
@AllArgsConstructor
public class RequestFilter {

    private List<PassCondition> passConditions;

    public boolean isVerifyRequest(String request) {
        return passConditions
                .stream()
                .anyMatch(passCondition -> passCondition.isPass(request));
    }
}
