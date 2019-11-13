package com.examples.java8;

public class DefaultDemo{

  public static void main(String[] args) {
    
    InterfaceDefault cd = new ClassDefault();
    
    cd.testOne();
    cd.testThree();
    cd.testFour();
    
    InterfaceDefault.testFive();

  }

}
