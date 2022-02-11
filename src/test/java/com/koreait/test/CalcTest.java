package com.koreait.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("=========== Before All ===========");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("=========== After All ===========");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("---- Before Each ----");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("---- After Each ----");
    }

    @Test
    public void sumTest() {
        System.out.println("[Sum Test}");
        Calc calc = new Calc();
        int n3 = 10;
        int n4 = 2;
        assertEquals((n3 + n4), calc.sum(n3, n4));

        int n1 = 10;
        int n2 = 15;
        int expectedResult = n1 + n2;

        int calcResult = calc.sum(n1, n2);

        assertEquals(expectedResult, calcResult);

    }

    @Test
    public void minusTest() {
        System.out.println("[Minus Test}");
        Calc calc = new Calc();
        int fn1 = 10;
        int fn2 = 0;

        assertEquals((fn1 - fn2), calc.minus(fn1, fn2));

        int sn1 = 20;
        int sn2 = 30;
        assertEquals((sn1 - sn2), calc.minus(sn1, sn2));
    }
}