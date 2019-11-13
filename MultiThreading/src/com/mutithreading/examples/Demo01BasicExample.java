package com.mutithreading.examples;

public class Demo01BasicExample {

  public static void main(String[] args) throws InterruptedException {
    
    //Thread t1 = new Thread(new ThreadOne());
    
    //We can not create thread directly from initializing a class that implements Runnable object, Without using Thread class
    //start() method to start the thread wont be available(it is available in Thread class)
    //We can not create and run a thread completely with out using Thread class
    Runnable t3 = new ThreadThree();
    //t3.start(); //this gives compile time error
        
    Thread t1 = new ThreadOne();
    
    Thread t2 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        for (int i = 1; i <= 10; i++) {
          System.out.println("Hello : "+i);
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });

    System.out.println("Start");
    
    t1.start();
    
    System.out.println("Middle");
    
    t2.start();
    
    System.out.println("End");
  }

}

class ThreadOne extends Thread{
  
  @Override
  public void run() {
    
    for (int i = 1; i <= 10; i++) {
      System.out.println("Helloooo : "+i);
      try {
        sleep(100);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

class ThreadThree implements Runnable {
  
  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Hello : "+i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
  
