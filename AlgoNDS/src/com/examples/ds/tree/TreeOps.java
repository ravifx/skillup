package com.examples.ds.tree;

public class TreeOps {
  
  public static boolean isBinarySearchTree(BinarySearchTree bst) {
    return isBinarySearchTree(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  private static boolean isBinarySearchTree(Node node, int min, int max) {
    
    if(node == null) {
      return true;
    }
    
    if(node.data < min || node.data >= max) {
      return false;
    }
    
    return isBinarySearchTree(node.left, min, node.data) && isBinarySearchTree(node.right, node.data, max);
    
  }
  
}
