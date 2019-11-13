package com.designpatterns.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

  private String ram;
  private String hdd;
  private String cpu;
  
  public ServerFactory(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  public void display() {
    System.out.println("This is server");
  }

  @Override
  public Computer createComputer() {
    return new Server(ram, hdd, cpu);
  }
  
}
