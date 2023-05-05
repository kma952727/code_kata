package com.example.demo.kata.give_me.present.impl;

import com.example.demo.kata.give_me.present.Present;

public class RedPresent extends Present{
    @Override
    public int getEventPoint(int point) {
        return point + 50;
    }
}
