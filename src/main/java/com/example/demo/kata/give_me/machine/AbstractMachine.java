package com.example.demo.kata.give_me.machine;

import com.example.demo.kata.give_me.present.Present;
import com.example.demo.kata.give_me.present.impl.GreenPresent;
import com.example.demo.kata.give_me.present.impl.RedPresent;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMachine {

    protected static Map<String, Present> presentMap = new HashMap<>();
    public abstract Present getPresent();

    static {
        presentMap.put("GREEN_CARD", new GreenPresent());
        presentMap.put("RED_CARD", new RedPresent());
    }
}
