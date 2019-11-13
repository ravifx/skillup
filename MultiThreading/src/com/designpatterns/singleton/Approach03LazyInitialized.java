package com.designpatterns.singleton;

public class Approach03LazyInitialized {

  private static Approach03LazyInitialized instance;
  
  private Approach03LazyInitialized() {}
  
  public static Approach03LazyInitialized getInstance() {
    if(instance == null) {
      instance = new Approach03LazyInitialized();
    }
    return instance;
  }
  
}
