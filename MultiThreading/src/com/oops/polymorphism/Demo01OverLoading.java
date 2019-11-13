package com.oops.polymorphism;

public class Demo01OverLoading {

  public static void main(String[] args) {
    
    //Abc abc = new Abc();
    
    //abc.method(new Long(10));
    
    System.out.println((10>>2) + " " + (10&1));

  }

}

class Abc{
  
  public void method(int i) {
    System.out.println("INT");
  }
  
  public void method(long i) {
    System.out.println("LONG");
  }
  
  public void method(float i) {
    System.out.println("FLOAT");
  }
  
}