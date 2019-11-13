package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

  StringHelper helper;
  
  private String input;
  private String expected;
  
  public StringHelperParameterizedTest(String input, String expected) {
    super();
    this.input = input;
    this.expected = expected;
  }

  @Parameters
  public static Collection<String[]> testConditions(){
    String expected[][] = {{"AACD", "CD"}, {"ACD", "CD"}};
    return Arrays.asList(expected);
  }
  
  @Before
  public void before() {
    helper = new StringHelper();
  }
  
  @Test
  public void testWithParameters() {
    assertEquals(expected, helper.truncateAInFirst2Positions(input));
  }
  
  /*@Test
  public void testTruncateAInFirst2Positions_AinFirst2Pos() {
    
    assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
  }

  @Test
  public void testTruncateAInFirst2Positions_AinFirstPos() {

    assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
  }
  
  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_Basic() {
    
    assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
  }
  
  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_Basic2() {
    
    assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABCDAB"));
  }
  
  @After
  public void teardown() {
    System.out.println("After the test");
  }*/
}
