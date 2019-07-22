package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindingNameTest {
    FindingName findingName;

    @Before
    public void setUp() throws Exception {
        findingName = new FindingName();
    }

    @After
    public void tearDown() throws Exception {
        findingName = null;
    }

    @Test
    public void givenStringAsInputShouldFindAndReturn() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = findingName.isHarryHere("this is Harry");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void givenStringAsInputShouldFindNotNull() {

        boolean actual = findingName.isHarryHere("This is harry.");
        assertNotNull(actual);

    }

}
