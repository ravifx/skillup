package com.examples.ds;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

  // Complete the isBalanced function below.
  static String isBalanced(String str) {

    Stack<Character> stack = new  Stack<Character>();

    for(char character:str.toCharArray()) {

      if(stack.isEmpty()) {
        
        stack.push(character);
        
      } else {

        Character peek = stack.peek();
        
        if((peek.charValue()=='{' && character=='}') || (peek.charValue()=='(' && character==')') || (peek.charValue()=='[' && character==']')) {
          stack.pop();
        }else {
          stack.push(character);
        }

      }

    }
    
    if(stack.empty()) {
      return "YES";
    } 
    return "NO";

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    String input = "{(})";

    String result = isBalanced(input);

    System.out.println("Is Balanced? "+result);

  }
}

