package com.designpatterns.singleton;

public class Approach05BillPughInnerStaticClass {

  private Approach05BillPughInnerStaticClass() {}

  private static class SingletonHelper{
    private static final Approach05BillPughInnerStaticClass INSTNACE = new Approach05BillPughInnerStaticClass();
  }
  
  public static Approach05BillPughInnerStaticClass getInstance() {
    
    return SingletonHelper.INSTNACE;
  }

}
