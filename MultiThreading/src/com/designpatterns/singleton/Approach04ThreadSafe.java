package com.designpatterns.singleton;

public class Approach04ThreadSafe {

  private static Approach04ThreadSafe instance;
  
  private Approach04ThreadSafe() {}
  
  public static synchronized Approach04ThreadSafe getInstance() {
    if(instance == null) {
      instance = new Approach04ThreadSafe();
    }
    return instance;
  }
  
}
