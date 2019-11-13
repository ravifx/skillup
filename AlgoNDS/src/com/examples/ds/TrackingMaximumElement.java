package com.examples.ds;

import java.util.Scanner;
import java.util.Stack;

public class TrackingMaximumElement {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int noOfInputs = scanner.nextInt();
    Stack stack = new Stack();
    Stack maxElmntStack = new Stack();

    while(noOfInputs != 0) {

      noOfInputs--;

      int type = scanner.nextInt();

      switch (type) {

        case 1:
          int element = scanner.nextInt();
          stack.push(element);
          if(maxElmntStack.isEmpty() || (int)maxElmntStack.peek() <= element) {
            maxElmntStack.push(element);
          }
          break;
        case 2:
          int topElmnt = (int)stack.pop();
          if(topElmnt >= (int)maxElmntStack.peek()) {
            maxElmntStack.pop();
          }
          break;
        case 3:
          System.out.println(maxElmntStack.isEmpty()?0:maxElmntStack.peek());
          break;
        default:
          break; 

      }
    }
    scanner.close();

  }

}
