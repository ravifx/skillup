package com.designpatterns.abstractfactory;

public class ComputerFactory {

  public static Computer createComputer(ComputerAbstractFactory factory) {
    
    return factory.createComputer();
    
  }
  
}
