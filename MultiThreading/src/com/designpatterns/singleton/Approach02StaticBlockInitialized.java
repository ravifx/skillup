package com.designpatterns.singleton;

public class Approach02StaticBlockInitialized {

  private static Approach02StaticBlockInitialized instance;
  
  private Approach02StaticBlockInitialized() {}
  
  static {
    try {
      instance = new Approach02StaticBlockInitialized();
    }catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  public static Approach02StaticBlockInitialized getInstance() {
    return instance;
  }
  
}
