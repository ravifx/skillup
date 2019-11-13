package com.mutithreading.examples;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo06CountdownLatches {

  public static void main(String[] args) throws InterruptedException {

    ExecutorService executor = Executors.newFixedThreadPool(3);
    
    //CountDownLatch is a thread safe class so there is no need to make methods synchronized
    CountDownLatch latch = new CountDownLatch(5);

    for (int i = 0; i < 5; i++) {
      executor.submit(new Runner(latch, i+1));
    }
    
    executor.shutdown();
    
    latch.await();
    //System.out.println("All tasks submitted..");
    
    //executor.awaitTermination(1, TimeUnit.DAYS);

    System.out.println("All tasks completed...");
  }
}

class Runner implements Runnable{

  CountDownLatch latch;
  int id;

  public Runner(CountDownLatch latch, int id) {
    this.latch = latch;
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println("Starting.. "+id);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Completed.. "+id);
    
    latch.countDown();
  }
}




