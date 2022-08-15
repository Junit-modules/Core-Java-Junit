package com.dev.tdd.corejava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DollarTest {

    //Testing for Dollar -- start
    @Test
    void testMultiplicationDollar() {
        assertEquals(Money.getDollar(10), Money.getDollar(5).times(2));
        assertEquals(Money.getDollar(15), Money.getDollar(5).times(3));
    }

    @Test
    void testEqualitiesDollar() {
        assertEquals(Money.getDollar(5), Money.getDollar(5));
        assertNotEquals(Money.getDollar(5), Money.getDollar(8));
    }
    //Testing for Dollar -- end

    //Testing for Franc -- start
    @Test
    void testMultiplicationFranc() {
        assertEquals(Money.getFranc(10), Money.getFranc(5).times(2));
        assertEquals(Money.getFranc(15), Money.getFranc(5).times(3));
    }

    @Test
    void testEqualitiesFranc() {
        assertEquals(Money.getFranc(5), Money.getFranc(5));
        assertNotEquals(Money.getFranc(5), Money.getFranc(8));
    }
    //Testing for Franc -- end

    //Common across
    @Test
    void compareMoney() {
        // We are comparing Dollar against Franc. So it should not be equals
        assertNotEquals(Money.getDollar(5), Money.getFranc(5));
    }

    @Test
    void testCurrency() {
        // We are comparing Dollar against Franc. So it should not be equals
        assertEquals("USD", Money.getDollar(1).getCurrency());
        assertEquals("CHG", Money.getFranc(1).getCurrency());
    }
}
