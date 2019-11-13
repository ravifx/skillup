package com.examples.ds;

public class LinkedList {

  Node head;
  Node tail;

  public LinkedList(){
    head=null;
    tail=null;
  }

  public void insertAtStart(int data) {

    Node node = new Node(data);

    if(head != null) {

      node.next = head;
      head = node;

    } else {
      head = node;
    }

  }

  public void insertAtLast(int data) {

    if(head == null) {
      head = new Node(data);
    }else {
      Node currentNode = head;
      while(currentNode.next != null) {
        currentNode = currentNode.next;
      }

      currentNode.next = new Node(data);
    }
  }

  public void deleteFromStart() {
    head = head.next;
  }

  public void deleteFromLast() {
    Node currentNode = head;
    Node temp = null;
    while(currentNode.next != null) {
      temp = currentNode;
      currentNode = currentNode.next;
    }

    if(temp != null) {
      temp.next = null;
    }else {
      head = null;
    }
  }

  public void traverseList() {

    Node currentNode = head;
    while(currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }

  }



}
