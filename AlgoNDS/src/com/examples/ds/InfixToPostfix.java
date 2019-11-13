package com.examples.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {

  public static void main(String[] args) {

    System.out.println("OUTPUT: "+getPostfixExp("((a+(b+c))*(a*(b*(c+(d/g)))))/((a*(c+(v+(t+(j+r))^y)))+((q+t)*((p+(q+d))^(u+v))))"));

    //System.out.println("OUTPUT: "+prefixToPostfix("+ab"));

  }

  public static String getPostfixExp(String infixExp) {

    Stack stack = new  Stack();

    String result = "";

    for(char character:infixExp.toCharArray()) {

      if(Character.isAlphabetic(character)) {
        result += character;

      }else if(character == ')') {
        while(!stack.isEmpty()) {
          char temp = (char)stack.pop();
          if(temp == '(') {
            break;
          }
          result += temp;
        }

      }else {
        stack.push(character);
      }

    }

    if(!stack.isEmpty()) {
      result += (char)stack.pop();
    }

    System.out.println("STACK: "+stack);

    return result;
  }

  public static String prefixToPostfix(String prefixStr) {

    String postfixes = "";
    Stack<String> stack = new Stack<String> ();

    for(int i = prefixStr.length()-1; i >= 0; i--){

      if(isOperator(prefixStr.charAt(i))){
        String operator1 = stack.pop();
        String operator2 = stack.pop();

        String temp = operator1+operator2+prefixStr.charAt(i);
        stack.push(temp);
      }else{
        stack.push(prefixStr.charAt(i)+"");
      }
    } 

    postfixes = postfixes+stack.pop();

    return postfixes;
  }

  private static boolean isOperator(char c){

    switch (c){
      case '+':
      case '-':
      case '/':
      case '*':

        return true;
    }
    return false;
  }

}
