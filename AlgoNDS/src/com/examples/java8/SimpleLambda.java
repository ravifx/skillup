package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SimpleLambda {

  public static void main(String[] args) {
    
    List list = Arrays.asList(1,2,3,4,5,6);

    Consumer c = new Consumer() {

      @Override
      public void accept(Object t) {
        System.out.println(t);
      }
            
    };
    
    Consumer cc = i -> System.out.println(i);
    
    list.forEach(i -> System.out.println(i));
    
  }

}
