package com.mutithreading.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo05ThreadPools {

  public static void main(String[] args) throws InterruptedException {

    ExecutorService executor = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 5; i++) {
      executor.submit(new Processr(i));
    }
    
    executor.shutdown();
    
    System.out.println("All tasks submitted..");
    
    executor.awaitTermination(1, TimeUnit.DAYS);

    System.out.println("All tasks completed...");
  }
}

class Processr implements Runnable{

  private int id;

  public Processr(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println("Starting.. "+ id);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Completed :: "+id);
  }
}




