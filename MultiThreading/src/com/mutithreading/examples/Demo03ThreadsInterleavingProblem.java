package com.mutithreading.examples;

public class Demo03ThreadsInterleavingProblem {

  private int count;

  public static void main(String[] args) throws InterruptedException {

    Demo03ThreadsInterleavingProblem obj = new Demo03ThreadsInterleavingProblem();

    obj.doWork();
  }
  
  //An intrinsic lock (aka monitor lock) is an implicit internal entity associated with each instance of objects.
  //When a synchronized method is called from a thread it needs to acquire the intrinsic lock.
  //A synchronized method can only be executed when it acquires the lock
  //Here the intrinsic lock of Demo03ThreadsInterleavingProblem obj is given to increment method
  //Thread will not give the lock to other threads untill the method is completely executed
  private  synchronized void increment() {
    count++;
  }

  public void doWork() throws InterruptedException {

    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Thread 01 Executing");
        for (int i = 1; i <= 10000; i++) {
          increment();
        }
        System.out.println("Thread 01 Completed");
      }
    });
    
    Thread t2 = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Thread 02 Executing");
        for (int i = 1; i <= 10000; i++) {
          increment();
        }
        System.out.println("Thread 02 Completed");
      }
      
    });

    t1.start();
    t2.start();
    
    t1.join();
    t2.join();
    
    System.out.println("Count : "+count);
    
  }

}


