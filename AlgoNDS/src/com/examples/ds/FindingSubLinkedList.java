package com.examples.ds;

public class FindingSubLinkedList {

  public static void main(String[] args) {
    
    LinkedList list1 = new LinkedList();

    list1.insertAtLast(1);
    list1.insertAtLast(2);
    list1.insertAtLast(3);
    list1.insertAtLast(4);
    list1.insertAtLast(5);
    list1.insertAtLast(6);
    
    System.out.println("LIST 1");
    list1.traverseList();
    
    LinkedList list2 = new LinkedList();
    
    list2.insertAtLast(1);
    list2.insertAtLast(3);
    list2.insertAtLast(4);
    
    System.out.println("LIST 2");
    list2.traverseList();
    
    
    Node current1 = list1.head;
    Node current2 = list2.head;
    
    boolean isSubList = false;
    
    boolean headFound = false;
    
    while(current1 != null) {
      
      if(!headFound) {
        if( current1.data == current2.data) {
          headFound = true;
          current2 = current2.next;
        }
      } else {
        if(current1.data == current2.data) {
          if(current2.next == null) {
            isSubList = true;
            break;
          }
          current2 = current2.next;
        } else {
          break;
        }
      }
      
        current1 = current1.next;
    }
    
    
    System.out.println("IS SUBLIST: "+isSubList);
    
    
    
    
  }

}
