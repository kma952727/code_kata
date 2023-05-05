package com.example.demo.kata.give_me.machine.impl;

import com.example.demo.kata.give_me.machine.AbstractMachine;
import com.example.demo.kata.give_me.present.Present;

public class RedMachine extends AbstractMachine {
    @Override
    public Present getPresent() {
        return presentMap.get("RED_CARD");
    }
}
