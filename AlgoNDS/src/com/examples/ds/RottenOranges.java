package com.examples.ds;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

  static int initInput[][] = {{0,1,2,0,1}, 
                              {0,0,1,0,2},
                              {2,1,1,0,1}};

  static int m = initInput.length;
  static int n = initInput[0].length;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Queue<Orange> freshOnes = new LinkedList<Orange>();

    for(int i=0; i < initInput.length; i++) {

      for(int j=0; j< initInput[i].length; j++) {

        if(initInput[i][j] == 1) {
          freshOnes.add(new Orange(i, j));
        }

      }
    }

    System.out.println("No of fresh oranges: "+freshOnes.size());
    System.out.println("No of days to rot: "+getNoOfDays(freshOnes, 0));

  }


  static int getNoOfDays(Queue<Orange> freshOnes, int dayCount) {

    Queue<Orange> toBeRotten = new LinkedList<Orange>();
    Queue<Orange> stillFresh = new LinkedList<Orange>();

    Orange orange = freshOnes.poll();

    while(orange != null) {

      if(isNbrRotten(orange.i, orange.j)) {
        toBeRotten.add(orange);
      }else {
        stillFresh.add(orange);
      }

      orange = freshOnes.poll();
    }

    if(toBeRotten.isEmpty()) {

      if(stillFresh.isEmpty()) {
        return dayCount;
      }else {
        return -1;
      }

    }

    orange = toBeRotten.poll();

    while(orange != null) {
      initInput[orange.i][orange.j] = 2;
      orange = toBeRotten.poll();
    }

    return getNoOfDays(stillFresh, ++dayCount);
  }




  static boolean isNbrRotten(int i, int j) {

    if (isValid(i, j-1) && initInput[i][j-1] == 2) {
      return true;
    }else if(isValid(i-1, j) && initInput[i-1][j] == 2) {
      return true;
    }else if(isValid(i, j+1) && initInput[i][j+1] == 2) {
      return true;
    }else if(isValid(i+1, j) && initInput[i+1][j] == 2) {
      return true;
    }

    return false;
  }


  static boolean isValid(int i, int j) {

    if(i >=0 && i < m && j >= 0 && j < n) {

      return true;

    }

    return false;
  }
}

class Orange {

  Orange(int i, int j){
    this.i = i;
    this.j = j;
  }

  int i;
  int j;

}
