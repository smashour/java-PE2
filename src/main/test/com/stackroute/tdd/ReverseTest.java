package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
        Reverse r;

    @Before
    public void setUp() throws Exception {
        r=new Reverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindrome() {
        assertEquals("amma",r.palindrome("amma"));
    }
    @Test
    public void notPalindrome() {
        assertEquals("olleh",r.palindrome("hello"));
    }

}