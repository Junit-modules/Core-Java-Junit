package com.dev.tdd.corejava;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int times) {
        return Money.getDollar(this.amount * times);
    }
}
