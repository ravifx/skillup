package com.designpatterns.singleton;

public class Approach01EagerInitialized {

  private static Approach01EagerInitialized instance = new Approach01EagerInitialized();
  
  private Approach01EagerInitialized() {
    
  }
  
  public static Approach01EagerInitialized getInstance() {
    return instance;
  }
  
}
