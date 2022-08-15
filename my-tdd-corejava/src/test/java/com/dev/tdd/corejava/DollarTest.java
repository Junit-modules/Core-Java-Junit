package com.dev.tdd.corejava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DollarTest {

    //Testing for Dollar -- start
    @Test
    void testMultiplicationDollar() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(new Dollar(10), product);

        product = dollar.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualitiesDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }
    //Testing for Dollar -- end

    //Testing for Franc -- start
    @Test
    void testMultiplicationFranc() {
        Franc franc = new Franc(5);
        Franc product = franc.times(2);
        assertEquals(new Franc(10), product);

        product = franc.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualitiesFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
    //Testing for Franc -- end

    //Common across
    @Test
    void compareMoney() {
        assertEquals(new Dollar(5), new Franc(5));
    }
}
