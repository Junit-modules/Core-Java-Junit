package com.dev.tdd.corejava;

import java.util.Objects;

public abstract class Money {

    protected int amount;

    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int times) ;

    public static Money getDollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money getFranc(int amount){
        return new Franc(amount, "CHG");
    }

    public String getCurrency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //it will fail when we compare Dollar and Franc, since it is using getClass()
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
