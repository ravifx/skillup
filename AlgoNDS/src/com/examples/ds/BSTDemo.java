package com.examples.ds;

public class BSTDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BST bst = new BST();
    
    bst.insertData(20);
    bst.insertData(10);
    bst.insertData(30);
    bst.insertData(40);
    //bst.insertData(25);
    bst.insertData(55);
    bst.insertData(5);
    bst.insertData(35);
    
    //System.out.println(bst.find(15));
    
    System.out.println("Tree elements in pre order = " );
    bst.printPreOrder(bst.root);
    
    System.out.println("Tree elements in in order = " );
    bst.printInOrder(bst.root);
    
    System.out.println("Tree elements in post order = " );
    bst.printPostOrder(bst.root);
    
    System.out.println("No of elements in tree = " + bst.getSize(bst.root));
    System.out.println("No of leaf nodes in tree = " + bst.getLeafNodes(bst.root));
    System.out.println("No of half leaf nodes in tree = " + bst.getHalfLeafNodes(bst.root));
    System.out.println("No of full leaf nodes in tree = " + bst.getFullLeafNodes(bst.root));
    System.out.println("Sum = " + bst.getSum(bst.root));
  }

}
