package com.examples.ds.tree;

public class BinarySearchTreeDemo {

  public static void main(String[] args) {
    
    BinarySearchTree bst = new BinarySearchTree();
    
    bst.insertIterative(12);
    bst.insertIterative(5);
    bst.insertIterative(3);
    bst.insertIterative(7);
    bst.insertIterative(9);
    bst.insertIterative(1);
    bst.insertIterative(15);
    bst.insertIterative(17);
    bst.insertIterative(13);
    bst.insertIterative(19);
    
    bst.preOrderTraversalIterative();
    System.out.println();
    bst.inOrderTraversalIterative();
    System.out.println();
    bst.postOrderTraversalIterative();
    System.out.println();
    System.out.println(bst.lowestCommonAncestor(3, 9).data);
    

  }

}
