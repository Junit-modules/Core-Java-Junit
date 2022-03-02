package com.dev.tdd.corejava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DollarTest {

    @Test
    void testMultiplication() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(new Dollar(10), product);

        product = dollar.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualities() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }
}
