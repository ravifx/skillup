package com.examples.ds;

import java.util.LinkedList;
import java.util.Stack;

public class ReversingAQueue {

  public static void main(String[] args) {
    
    int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    //int[] input = {1, 2, 3, 4, 5};
    
    java.util.Queue que = new LinkedList();
    
    for (int i = 0; i < input.length; i++) {
      que.add(input[i]);
    }

    System.out.println("ORIGINAL QUEUE: "+que);
    
    Stack stack = new Stack();
    
    while(!que.isEmpty()) {
      stack.push(que.poll());
    }
    
    while(!stack.isEmpty()) {
      que.add(stack.pop());
    }
    
    System.out.println("REVERSED QUEUE: "+que);
    
  }

}
