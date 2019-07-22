package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;

    @org.junit.Before
    public void setUp() throws Exception {
        this.stringCount = new StringCount();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        stringCount = null;
    }

    @Test
    public void givenStringAsInputShouldReturnTheCharacterCount() {
        int actualResult = stringCount.chardata(2);
        assertEquals(2, actualResult);
    }

    @Test
    public void givenStringAsInputShouldReturncharacterCountNotNull() {
        int actual = stringCount.chardata(4);
        assertNotNull(actual);

    }

}