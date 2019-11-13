package com.examples.ds;

import java.util.Stack;

public class MaximumDepthOfParenthesis {

  public static void main(String[] args) {

    String input = "( ((X)) (((Y)) ))";
    
    System.out.println("OUTPUT: "+getMaxDepth(input));

  }
  
  public static int getMaxDepth(String input) {
    
    int maxDepth = 0;
    Stack stack = new Stack<>();
    
    for(char singleChar:input.toCharArray()) {
      
      if(singleChar == '(') {
        stack.push(singleChar);
      }else if(singleChar == ')') {
        if(stack.isEmpty()) {
          return -1;
        }
        stack.pop();
      }
      
      if(maxDepth < stack.size()) {
        maxDepth = stack.size();
      }
      
    }
    
    if(stack.isEmpty()) {
      return maxDepth;
    }else {
      return -1;
    }
    
  }

}
