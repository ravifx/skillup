package com.designpatterns.factory;

public class PersonalComputer extends Computer {

  private String ram;
  private String hdd;
  private String cpu;
  
  public PersonalComputer(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    
    //System.out.println("Personal Computer Created");
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
    System.out.println("This is personal computer");
  }
  
}
