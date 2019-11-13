package com.examples.ds.tree;

public class AVLTreeDemo {

  public static void main(String[] args) {
    
    AVLTree avl = new AVLTree();
    
    avl.insertRecursive(1);
    avl.insertRecursive(5);
    avl.insertRecursive(3);
    avl.insertRecursive(7);
    avl.insertRecursive(9);
    avl.insertRecursive(1);
    avl.insertRecursive(15);
    avl.insertRecursive(17);
    avl.insertRecursive(13);
    avl.insertRecursive(19);
    
    System.out.println("DONE");

  }

}
