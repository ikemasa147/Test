package com.ikeda.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TryJunitTest {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEachです！");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEachです！");
    }

    @Test
    void main() {
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
}