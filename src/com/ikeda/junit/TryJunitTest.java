package com.ikeda.junit;

import org.junit.jupiter.api.*;

class TryJunitTest {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEachです！");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEachです！");
    }

    public static void main(String[] args) {
        System.out.println("Test2です！");
    }

    @Test
    void sub() {
        System.out.println("Test1です！");
    }

    @BeforeAll
    static void initAll(){
        System.out.println("BeforeAllです！");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("AfterAllです！");
    }

    @Test
    void testSub() {
    }
}