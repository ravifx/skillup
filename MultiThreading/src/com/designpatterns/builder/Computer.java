package com.designpatterns.builder;

public class Computer {

  // mandatory parameters
  private String ram;
  private String hdd;

  // optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  private Computer(ComputerBuilder builder) {
    this.ram = builder.ram;
    this.hdd = builder.hdd;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public String getHdd() {
    return hdd;
  }

  public void setHdd(String hdd) {
    this.hdd = hdd;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
    this.isGraphicsCardEnabled = isGraphicsCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  public void setBluetoothEnabled(boolean isBluetoothEnabled) {
    this.isBluetoothEnabled = isBluetoothEnabled;
  }

  public void display() {
    System.out.println("This is personal computer");
  }

  
  
  public static class ComputerBuilder {

    // mandatory parameters
    private String ram;
    private String hdd;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String ram, String hdd) {
      this.ram = ram;
      this.hdd = hdd;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }
    
    public Computer build() {
      return new Computer(this);
    }

  }
}
