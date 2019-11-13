package com.examples.ds;

import java.util.LinkedList;
import java.util.Stack;

public class SortingQueue {

  public static void main(String[] args) {

    //int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    
    int[] input = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    
    java.util.Queue que = new LinkedList();
    
    for (int i = 0; i < input.length; i++) {
      que.add(input[i]);
    }
    
    System.out.println("ORIGINAL QUEUE: "+que);
    
    Stack stack = new Stack();
    Stack tempStack = new Stack();
    
    while(!que.isEmpty()) {
      
      //System.out.println("PEEK: "+que.peek());
      
      if(stack.isEmpty()) {
        stack.push(que.poll());
      } else {
        int element = (int)que.poll();
        int size = stack.size();
        while(size-- != 0) {
          if((int)stack.peek() < element) {
            tempStack.push(stack.pop());
            if(stack.isEmpty()) {
              stack.push(element);
            }
           
          } else {
            stack.push(element);
            break;
          }
        }
        
        //System.out.println("tempStack: "+tempStack);
        
        while(!tempStack.isEmpty()) {
          stack.push(tempStack.pop());
        }
        
        //System.out.println("stack: "+stack);
      }
      
      
        
      }
    
    while(!stack.isEmpty()) {
      que.add(stack.pop());
    }
    
    System.out.println("SORTED QUEUE: "+que);
    
  }

}
