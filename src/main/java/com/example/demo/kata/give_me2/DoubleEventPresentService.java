package com.example.demo.kata.give_me2;

import com.example.demo.kata.give_me2.present.Present;
import com.example.demo.kata.give_me2.present.PresentCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * give_me version 2
 * 쇼핑몰 이벤트
 * 100,000원 이상 결제시 이벤트 카드를 획득합니다.
 * 카드에는 골드카드, 레드카드가 존재하며 카드에는 N개의 선물이 포함되며
 * 선물은 종류마다 다른 포인트를 포함합니다.
 *
 * 사용자의 카드를 받아 포인트를 적립합니다.
 *
 *
 * 수정 포인트
 * 1. 선물에 종속된 기능, 정보가 추가 가능성이 있음
 * 2. 카드의 종류가 늘어날 수 있음
 * 3. 카드의 종류마다 소유하는 선물의 종류, 개수가 변할 수 있음
 */
@Service
@RequiredArgsConstructor
public class DoubleEventPresentService {

    private final DB db;

    public void tryEvent(PresentCard card) {
        int totalEventPoint = card.accumulateEventPoint();
        db.write(totalEventPoint);
    }
}
