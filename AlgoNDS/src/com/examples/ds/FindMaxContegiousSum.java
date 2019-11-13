package com.examples.ds;

public class FindMaxContegiousSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int[] arry = {-2,-3,4,-1,-2,1,5,-3};
    
    //known as cadence algorithm asked in dynamic prog
    
    int max_so_far=0;
    int max_ending=0;
    
    for (int i=0;i < arry.length;i++) {
      max_ending = max_ending+arry[i];
      if(max_ending < 0) {
        max_ending = 0;
      }
      if(max_ending>max_so_far) {
        max_so_far = max_ending;
      }
    }
    
    System.out.println("Max Sum:"+max_so_far);

  }

}
