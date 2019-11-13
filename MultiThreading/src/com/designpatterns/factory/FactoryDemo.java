package com.designpatterns.factory;

public class FactoryDemo {

  public static void main(String[] args) {
    
    Computer personal = ComputerFactory.getComputer("Personal", "2GB", "1TB", "4Core");
    
    Computer server = ComputerFactory.getComputer("Server", "32GB", "2TB", "16Core");
    
    personal.display();
    System.out.println("PESONAL: "+ personal);
    
    server.display();
    System.out.println("SERVER: "+ server);
    
  }

}
