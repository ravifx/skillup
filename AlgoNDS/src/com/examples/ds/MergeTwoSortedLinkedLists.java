package com.examples.ds;

public class MergeTwoSortedLinkedLists {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList list3 = new LinkedList();
    
    list1.insertAtLast(1);
    list1.insertAtLast(4);
    list1.insertAtLast(6);
    
    list2.insertAtLast(2);
    list2.insertAtLast(5);
    list2.insertAtLast(7);
    
    System.out.println("LIST 1");
    list1.traverseList();
    
    System.out.println("LIST 2");
    list2.traverseList();

    Node current1 = list1.head;
    Node current2 = list2.head;
    
    while(current1 != null || current2 != null) {
      
      if(current1 == null) {
        list3.insertAtLast(current2.data);
        current2 = current2.next;
      }else if(current2 == null) {
        list3.insertAtLast(current1.data);
        current1 = current1.next;
      } else {
        
        if(current1.data <= current2.data) {
          
          list3.insertAtLast(current1.data);
          current1 = current1.next;
        }else {
          list3.insertAtLast(current2.data);
          current2 = current2.next;
        }
        
      }
      
    }
    
    System.out.println("LIST 3");
    list3.traverseList();
    
  }

}
