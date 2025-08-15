package com.ikeda.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DiscountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setDiscount() {
        Discount disc = new Discount();
        assertEquals(700,disc.setDiscount(1000,0.3));
        assertEquals(705,disc.setDiscount(1000,0.3),5);
//        assertEquals(700,disc.setDiscount(1000,0.35),5,"値引き率が正しくありません。");
    }

    @Test
    void calcRate() {
        Discount disc = new Discount();
//        assertEquals("OK",disc.calcRate(0.1,0.3),"値引き率が正しくありません。");
    }

    @Test
    void num() {
        Discount disc = new Discount();
        assertSame(10,disc.num());
        assertNotSame(20,disc.num());
    }

    @Test
    void str() {
        Discount disc = new Discount();
        assertSame("abc",disc.str());
        assertNotSame("xyz",disc.str());
        assertEquals("abc",disc.str());
    }

    @Test
    void testStr() {
        Discount disc = new Discount();
        assertSame("abc",disc.str("abc"));
        assertNotSame("xyz",disc.str("abc"));
    }
    @Test
    void str2() {
        Discount disc = new Discount();
        //       assertSame("abcd",disc.str2());     // =
        assertEquals("abcd",disc.str2());   // equals
    }


    @Test
    void array() {
        Discount disc = new Discount();
        int[] ary = {0,1,2,3,4,5};
    }

    @Test
    void nullValue() {
        Discount disc = new Discount();
        assertNull(disc.nullValue(null));
        assertNotNull(disc.nullValue("abc"));
    }

    @Test
    void trueValue() {
        Discount disc = new Discount();
        assertTrue(disc.trueValue());
    }

    @Test
    void falseValue() {
        Discount disc = new Discount();
        assertFalse(disc.falseValue());
    }

    @Test
    void sexCheck() {
        Discount disc = new Discount();
        assertEquals(0.2,disc.sexCheck("f"),0.0);
        assertEquals(0.1,disc.sexCheck("m"),0.0);
    }

}