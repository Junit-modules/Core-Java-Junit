package com.dev.tdd.corejava;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int times) {
        return Money.getFranc(this.amount * times);
    }
}
