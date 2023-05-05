package com.example.demo.kata.give_me2.present;

import com.example.demo.kata.give_me2.present.Present;
import com.example.demo.kata.give_me2.present.impl.GoldPresent;
import com.example.demo.kata.give_me2.present.impl.RedPresent;

import java.util.List;

public enum PresentCard {
    RUBY_CARD("GOLD_CARD", List.of(new RedPresent(), new GoldPresent(), new GoldPresent())),
    STONE_CARD("RED_CARD", List.of(new RedPresent()));

    private final String cardName;
    private final List<Present> presents;

    public int accumulateEventPoint() {
        return presents.stream()
                .mapToInt(Present::getEventPoint)
                .sum();
    }
    PresentCard(String cardName, List<Present> presents) {
        this.cardName = cardName;
        this.presents = presents;
    }

}
