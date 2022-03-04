package com.dev.tdd.corejava;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int times) {
        return new Dollar(this.amount * times);
    }
}
