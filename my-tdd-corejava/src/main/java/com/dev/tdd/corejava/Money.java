package com.dev.tdd.corejava;

import java.util.Objects;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //it will fail when we compare Dollar and Franc, since it is using getClass()
        //if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
