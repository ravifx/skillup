package com.designpatterns.abstractfactory;

public abstract class Computer {
  
  public abstract String getRAM();
  public abstract String getHDD();
  public abstract String getCPU();
  
  public abstract void display();
  
  @Override
  public String toString() {
    return "Computer [RAM()=" + getRAM() + ", HDD()=" + getHDD() + ", CPU()=" + getCPU() + "]";
  }
  
}
