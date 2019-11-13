package com.examples.ds;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

  public static void main(String[] args) throws IOException{
    
    int[] inputOne = {3,2,1,1,1};
    int[] inputTwo = {4,3,2};
    int[] inputThree = {1, 1, 4, 1};
    
    System.out.println("OUTPUT: "+equalStacks(inputOne, inputTwo, inputThree));
    
  }

  private static int equalStacks(int[] h1, int[] h2, int[] h3) {
    
    Stack stackOne = new Stack();
    Stack stackTwo = new Stack();
    Stack stackThree = new Stack();
    
    int sumOne =0, sumTwo=0, sumThree = 0; 
    
    for (int i=h1.length-1;i>=0;i--) {
      stackOne.push(h1[i]);
      sumOne+=h1[i];
    }
    
    for (int i=h2.length-1;i>=0;i--) {
      stackTwo.push(h2[i]);
      sumTwo+=h2[i];
    }
    
    for (int i=h3.length-1;i>=0;i--) {
      stackThree.push(h3[i]);
      sumThree+=h3[i];
    }
    
    while(!(sumOne==sumTwo && sumTwo==sumThree)) {
      
      if((sumOne >= sumTwo) && (sumOne >= sumThree)) {
        sumOne -= (int)stackOne.pop();
      }else if((sumTwo >= sumOne) && (sumTwo >= sumThree)) {
        sumTwo -= (int)stackTwo.pop();
      }else {
        sumThree -= (int)stackThree.pop();
      }
      
      if(sumOne==0 || sumTwo==0 || sumThree==0) {
        return 0;
      }
    }
    
    return sumOne;
  }

}
