package com.designpatterns.builder;

public class BuilderDemo {

  public static void main(String[] args) {
    
    //Computer computer = new ComputerBuilder("2GB", "25GB").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
    
    Computer computer = new Computer.ComputerBuilder("2GB", "25GB").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
    
    computer.display();
  }

}
