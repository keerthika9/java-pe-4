package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
  ReplaceCharacters replaceCharacters;
  @Before
  public void setUp() throws Exception {
    replaceCharacters=new ReplaceCharacters();
  }

  @After
  public void tearDown() throws Exception {
    replaceCharacters=null;
  }

  @Test
  public void givenStringAsInputShouldreplaceCharacters() {
    String expected="faity fry";
    String actual=replaceCharacters.replace("daily dry");
    assertEquals(expected,actual);

  }

  @Test
  public void givenStringAsInputShouldreplaceCharactersNotNull() {
    String actual=replaceCharacters.replace("daily dry");
    assertNotNull(actual);

  }

}
