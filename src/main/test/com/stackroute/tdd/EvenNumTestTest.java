package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest num;

    @Before
    public void setUp() throws Exception {
        num=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {

        assertTrue(num.isEven(12));
    }

    @Test
    public void isNotEven() {

        assertFalse(num.isEven(77));
    }
}