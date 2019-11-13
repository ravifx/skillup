package com.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class BreakingSingletonWithReflection {

  public static void main(String[] args) throws Exception {
    
    Approach05BillPughInnerStaticClass instance01 = Approach05BillPughInnerStaticClass.getInstance();
    Approach05BillPughInnerStaticClass instance02 = Approach05BillPughInnerStaticClass.getInstance();
    
    Approach05BillPughInnerStaticClass instance03 = null;
    
    Constructor[] constructors = Approach05BillPughInnerStaticClass.class.getDeclaredConstructors();
    
    for (Constructor constructor : constructors) {
      constructor.setAccessible(true);
      instance03 = (Approach05BillPughInnerStaticClass)constructor.newInstance();
      break;
    }
    
    System.out.println("Hashcode of Instance 01: "+instance01.hashCode());
    System.out.println("Hashcode of Instance 02: "+instance02.hashCode());
    System.out.println("Hashcode of Instance 03: "+instance03.hashCode());
  }
  
}