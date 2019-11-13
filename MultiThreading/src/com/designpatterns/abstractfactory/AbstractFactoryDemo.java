package com.designpatterns.abstractfactory;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    
    Computer personal = ComputerFactory.createComputer(new PersonalComputerFactory("2GB", "1TB", "4Core"));
    
    Computer server = ComputerFactory.createComputer(new ServerFactory("32GB", "2TB", "16Core"));
    
    personal.display();
    System.out.println("PESONAL: "+ personal);
    
    server.display();
    System.out.println("SERVER: "+ server);
    
  }

}
