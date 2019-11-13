package com.examples.ds;

public class Factorial {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println(fact(5));
    
  }
  
  static int[] fact = new int[10];
  
  static int fact(int n) {
    
      fact[0] = 0;
      fact[1] = 1;
    
    for(int i=2; i <= n; i++) {
      fact[i] = i * fact[i-1];
    }
    
    return fact[n];
  }
  
}
