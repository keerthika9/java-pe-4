package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose transpose;

    @Before
    public void setUp() throws Exception {
        transpose = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }

    @Test
    public void givenStringAsInputShouldReturnTransposedvalue() {
        //Arrange
        String[] expectedValue = {"cat,dog"};
        //Act
        String[] actualValue = transpose.transposeString("god,tac");
        //Assert
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void transposeNull() {

        String[] actual = transpose.transposeString(null);
        assertNull(actual);
    }

    @Test
    public void transposeNotNull() {

        String[] actual = transpose.transposeString("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);

    }
}
