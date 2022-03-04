package com.dev.tdd.corejava;

import java.util.Objects;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int times) {
        return new Franc(this.amount * times);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc Franc = (Franc) o;
        return amount == Franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
