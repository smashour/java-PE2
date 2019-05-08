package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power no;
    @Before
    public void setUp() throws Exception {
        no=new Power();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void number() {
        assertSame(1,no.number(16));
    }
    @Test
    public void notPowerOf4(){
        assertSame(0,no.number(33));
    }
}