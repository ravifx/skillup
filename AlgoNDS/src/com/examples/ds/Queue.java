package com.examples.ds;

public class Queue {

  private int front;
  private int rear;
  int [] queueArray;
  int maxSize;
  int currentSize;

  public Queue(int size) {
    front = 0;
    rear = -1;
    queueArray = new int[size];
    maxSize = size;
    currentSize = 0;
  }

  public void enqueue(int data) {    
    queueArray[++rear] = data;
    currentSize++;
  }

  public int dequeue() {
    return queueArray[front++];
  }
  
  public boolean isEmpty() {
    //return queueArray.length < 1;
    return rear == -1;
  }
  
  public boolean isFull() {
    return rear == (maxSize-1);
  }
}
