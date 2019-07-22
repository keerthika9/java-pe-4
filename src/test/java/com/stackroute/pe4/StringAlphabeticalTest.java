package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringAlphabeticalTest {
  StringAlphabetical stringAlphabetical;
  @Before
  public void setUp() throws Exception {
 stringAlphabetical=new StringAlphabetical();
  }

  @After
  public void tearDown() throws Exception {
    stringAlphabetical=null;
  }
  @Test
  public void givenParagraphAsInputShouldReturnSortedWords() {
    String []expected="A, a,a,discourse,is,of,paragraph,self-contained,unit".split("[\\s,]+");
    String []actual=stringAlphabetical.sortWords("A paragraph is a self-contained unit of a discourse ");
    assertArrayEquals(expected,actual);
  }
  @Test
  public void givenParagraphAsInputShouldReturnParagraphNull() {

    String []actual=stringAlphabetical.sortWords(null);
    assertNull(actual);
  }

}

