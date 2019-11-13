package com.examples.ds;

import java.util.Arrays;

public class FindMissingNDuplicate {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int [] arry = {5,1,2,3};
    
    int n = arry.length+1;
    int sum = 0;
    for(int i=0;i<arry.length;i++) {
      sum = sum+arry[i];
    }
    
    System.out.println("Missing No: "+(((n*(n+1))/2)-sum));

    int [] arryA = {5,1,2,2,3};
    
    int nA = arryA.length;
    int sumA = 0;
    for(int i=0;i<arryA.length;i++) {
      sumA = sumA+arryA[i];
    }
    
    System.out.println("Duplicate No: "+(((nA*(nA+1))/2)-sumA));
    
  }

}
