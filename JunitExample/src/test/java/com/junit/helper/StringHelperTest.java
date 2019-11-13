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
public class StringHelperTest {

  StringHelper helper;
  
  private String input;
  private String expected;
  
  public StringHelperTest(String input, String expected) {
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

}
