package com.examples.ds;

public class QueueDemo {

  public static void main(String[] args) {

    Queue queue = new Queue(3);
    
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    
    while(!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }

  }

}
