package com.mutithreading.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo04ThreadsMultipleLocks {

  public static void main(String[] args) throws InterruptedException {

    System.out.println("Started...");

    Worker worker = new Worker();

    long start = System.currentTimeMillis();

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {

        try {
          worker.process();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {

        try {
          worker.process();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    long end = System.currentTimeMillis();

    System.out.println("Time Taken: "+(end - start)+" Milli Secs");

    System.out.println("List1 Size: "+worker.listOneSize()+" ::: List2 Size: "+worker.listTwoSize());
  }

}

class Worker{

  private Random random = new Random();
 
  //We can achieve the correct results by synchronizing process() method or stageOne() and StageTwo() methods 
  //But the performance will go down as the method locks entire Worker class object and blocks other methods(ex method updating different arraylist)
  //Creating separate locks will allow other parts of the code to continue to execute, this will improve performance
  
  Object lock1 = new Object();
  Object lock2 = new Object();

  private List<Integer> list1 = new ArrayList<Integer>();
  private List<Integer> list2 = new ArrayList<Integer>();

  public void stageOne() throws InterruptedException {
    synchronized(lock1) {
      Thread.sleep(1);
      list1.add(random.nextInt(100));
    }
  }

  public void stageTwo() throws InterruptedException {
    synchronized(lock2) {
      Thread.sleep(1);
      list2.add(random.nextInt(100));
    }
  }

  public void process() throws InterruptedException {
    for (int i = 0; i < 1000; i++) {
      stageOne();
      stageTwo();
    }
  }

  public int listOneSize() {
    return list1.size();
  }

  public int listTwoSize() {
    return list2.size();
  }
}


