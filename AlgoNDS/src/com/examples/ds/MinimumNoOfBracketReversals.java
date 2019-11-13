package com.examples.ds;

import java.util.Stack;

public class MinimumNoOfBracketReversals {

  public static void main(String[] args) {

    String input = "}{{}}{{{";

    System.out.println("OUTPUT: "+getReversalCount(input));

  }

  public static int getReversalCount(String input) {

    Stack stack = new Stack();
    int reversalCount = 0;

    if((input.length()%2) != 0) {
      return -1;
    }

    for(char character:input.toCharArray()) {

      if(character == '{') {
        stack.push('{');
      }else if(character == '}') {
        if(stack.isEmpty()) {
          reversalCount++;
          stack.push('{');
        }else {
          stack.pop();
        }
      }

    }

    return reversalCount+(stack.size()==0?stack.size():(stack.size()/2));

  }

}
