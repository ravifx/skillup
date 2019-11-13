package com.designpatterns.factory;

public class Server extends Computer {

  private String ram;
  private String hdd;
  private String cpu;
  
  public Server(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    
    //System.out.println("Server Created");
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

  @Override
  public void display() {
    System.out.println("This is server");
    
  }

  
  
}
