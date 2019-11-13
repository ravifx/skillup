package com.examples.core;

public class Simple {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    A a = new B();
    B b = new B();    
    a.show();
    b.show();
  }

}


class A {
  
  public void show() {
    System.out.println("ShowA");
  }
  
}

class B extends A {
  
  public void show() {
    System.out.println("ShowB");
  }
  
  public void showNew() {
    System.out.println("ShowBNew");
  }
}