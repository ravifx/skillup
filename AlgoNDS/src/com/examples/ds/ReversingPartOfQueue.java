package com.examples.ds;

import java.util.LinkedList;
import java.util.Stack;

public class ReversingPartOfQueue {

  public static void main(String[] args) {
    
    int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int k = 5;
    
    java.util.Queue que = new LinkedList();
    
    for (int i = 0; i < input.length; i++) {
      que.add(input[i]);
    }

    System.out.println("ORIGINAL QUEUE: "+que);
    
    Stack stack = new Stack();
    java.util.Queue tempQue = new LinkedList();
    
    while(!que.isEmpty()) {
      if(stack.size() < k) {
        stack.push(que.poll());
      } else {
        tempQue.add(que.poll());
      }
    }
    
    System.out.println("STACK: "+stack);
    System.out.println("TEMP Q: "+tempQue);
    
    while(!stack.isEmpty()) {
      que.add(stack.pop());
    }
    
    while(!tempQue.isEmpty()) {
      que.add(tempQue.poll());
    }
    
    System.out.println("REVERSED "+k+" ELEMENTS OF QUEUE: "+que);
    
  }

}
