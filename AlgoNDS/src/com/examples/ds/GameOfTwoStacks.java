package com.examples.ds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {

  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws Exception {

    //int [] a = {4, 2, 4, 6, 1};
    //int [] b = {2, 1, 8, 5};
    
    //System.out.println("SCORE: "+twoStacks(10, a, b));
    
    int [] a = {16, 17, 9, 3, 12, 19};
    int [] b = {9, 3, 4, 19, 18, 4, 1, 5, 15, 1, 12, 2, 18, 18, 2, 1, 4, 10, 4, 3, 1, 13, 0, 4, 17, 16, 14, 6, 11, 6, 6, 0, 9, 10, 12, 0, 14, 13, 5, 1, 14, 9, 4, 4};
    
    System.out.println("SCORE: "+twoStacks(73, a, b));
    
  }

  static int twoStacks(int x, int[] a, int[] b) {

    int score = 0;
    int currentSum = 0;
    
    Stack stackA = new Stack();
    Stack stackB = new Stack();
    
    for(int i=a.length-1;i >= 0; i--) {
      stackA.push(a[i]);
    }
    
    for(int i=b.length-1;i >= 0; i--) {
      stackB.push(b[i]);
    }
    
    System.out.println("stackA: "+stackA);
    System.out.println("stackB: "+stackB);
    
    int stackASum = 0;
    int stackBSum = 0;
    
    int stackAscore = 0;
    int stackBscore = 0;
    
    Stack stackAtemp = new Stack();
    Stack stackBtemp = new Stack();
    
    while(!stackA.isEmpty()) {
      stackASum += (int)stackA.peek();
      stackAtemp.push(stackA.pop());
      
      if(stackASum >= x) {
        break;
      }else {
        stackAscore++;
      }
    }
    
    while(!stackAtemp.isEmpty()) {
      stackA.push(stackAtemp.pop());
    }
    
    while(!stackB.isEmpty()) {
      stackBSum += (int)stackB.peek();
      stackBtemp.push(stackB.pop());
      
      if(stackBSum >= x) {
        break;
      }else {
        stackBscore++;
      }
    }
    
    while(!stackBtemp.isEmpty()) {
      stackB.push(stackBtemp.pop());
    }
    
    while(currentSum < x && !stackA.isEmpty() && !stackB.isEmpty()) {
      
      if((int)stackA.peek() <= (int)stackB.peek()) {
        currentSum += (int)stackA.pop();
      }else {
        currentSum += (int)stackB.pop();
      }
      
      System.out.println("stackA: "+stackA);
      System.out.println("stackB: "+stackB);
      System.out.println("score: "+score);
      
      if(currentSum <= x) {
        score++;
      }
      
    }
    
    if(stackAscore >= stackBscore && stackAscore >= score) {
      return stackAscore;
    }else if(stackBscore >= stackAscore && stackBscore >= score) {
      return stackBscore;
    }
    
    return score;
    
  }

}
