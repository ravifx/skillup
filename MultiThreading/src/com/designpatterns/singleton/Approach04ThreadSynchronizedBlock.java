package com.designpatterns.singleton;

public class Approach04ThreadSynchronizedBlock {

  private static Approach04ThreadSynchronizedBlock instance;

  private Approach04ThreadSynchronizedBlock() {}

  public static Approach04ThreadSynchronizedBlock getInstance() {
    if(instance == null) {
      
      synchronized(Approach04ThreadSynchronizedBlock.class) {
        
        if(instance == null) {
          instance = new Approach04ThreadSynchronizedBlock();
        }
        
      }
    }
    return instance;
  }

}
