package com.example.demo.kata.give_me;

import com.example.demo.kata.give_me.machine.AbstractMachine;
import com.example.demo.kata.give_me.present.Present;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 던전앤 파이터에서 50주년 이벤트를 합니다.
 * 불타는 그락카락에서 기계를 습득하여 다양한 혜택을 누려보세요.
 *
 * 특징
 * 1. 기계에 대한 정보와 분리
 * 2. 선물에 대한 정보와 분리
 */
@Component
@AllArgsConstructor
public class DoubleEventPresentService {
    private final DB db;

    public void accumulateEventPoint(AbstractMachine machine, int chargePoint) {
        int eventPoint = machine
                .getPresent() // "선물" 줘
                .getEventPoint(chargePoint); // "이벤트 포인트" 줘

        db.writePoint(eventPoint);
    }

}
