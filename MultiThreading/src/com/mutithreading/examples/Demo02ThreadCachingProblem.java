package com.mutithreading.examples;

import java.util.Scanner;

public class Demo02ThreadCachingProblem {

  public static void main(String[] args) {

     Processor proc = new Processor();
     
     proc.start();

     System.out.println("Please press enter to stop...");
     
     try(Scanner scanner  = new Scanner(System.in);){
       
       scanner.nextLine();
     
       proc.shutdown();
     }
  }

}

class Processor extends Thread{
  
  //CACHING PROBLEM
  //if we don't use volatile keyword, execution still continues even after calling shutdown method on some systems/java implementations
  //using volatile makes sure that thread dosen't cache the value of "running" variable value
  private volatile boolean running = true;
  
  @Override
  public void run() {
    
    while(running) {
      System.out.println("Hello");
      try {
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
  public void shutdown() {
    running = false;
  }
}
