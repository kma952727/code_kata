package com.example.demo.kata.give_me;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DB {

    public void writePoint(int point) {
        System.out.println("write Point " + point);
    }
}
