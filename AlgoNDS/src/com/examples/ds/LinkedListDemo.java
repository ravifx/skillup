package com.examples.ds;

public class LinkedListDemo {

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    
    list.insertAtStart(10);
    list.insertAtLast(20);
    
    list.traverseList();
    System.out.println("");
    list.insertAtStart(30);
    
    list.traverseList();
    System.out.println("");
    
    list.deleteFromLast();
    list.traverseList();
  }

}
