package com.example.demo.kata.give_me2.present.impl;

import com.example.demo.kata.give_me2.present.Present;

public class GoldPresent extends Present {

    private final static int GOLD_EVENT_POINT = 100;
    @Override
    public int getEventPoint() {
        return GOLD_EVENT_POINT;
    }
}
