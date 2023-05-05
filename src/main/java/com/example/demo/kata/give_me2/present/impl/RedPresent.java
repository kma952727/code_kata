package com.example.demo.kata.give_me2.present.impl;

import com.example.demo.kata.give_me2.present.Present;

public class RedPresent extends Present {

    private static final int DEEP_RED_EVENT_POINT = 15;

    @Override
    public int getEventPoint() {
        return DEEP_RED_EVENT_POINT;
    }
}
