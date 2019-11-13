package com.examples.ds.tree;

public class AVLTree {
  
  Node root;
  
  public AVLTree() {
    root = null;
  }
  
  public boolean isEmpty() {
    return root == null;
  }

  public void insertRecursive(int data) {
    root = insert(root, data);
  }
  
  private Node insert(Node node, int data) {

    if(node == null) {
      return new Node(data);
    } else if(node.data < data) {
      node.right = insert(node.right, data);
    } else {
      node.left = insert(node.left, data);
    }
    
    int balance = height(node.left) - height(node.right);
    
    if(balance > 1) {
      
      if(height(node.left.left) >= height(node.left.right)){
        node = rotateRight(node);
      } else {
        node.left = rotateLeft(node.left);
        node = rotateRight(node);
      }
      
    } else if (balance < -1) {
      
      if(height(node.right.right) >= height(node.right.left)) {
        
        node = rotateLeft(node);
        
      } else {
        
        node.right = rotateRight(node.right);
        node = rotateLeft(node);
        
      }
       
    }

    return node;
  }
  
  private Node rotateRight(Node root) {
    
    Node newRoot = root.left;
    root.left = root.left.right;
    newRoot.right = root;
    
    return newRoot;
      
  }
  
  private Node rotateLeft(Node root) {
    
    Node newRoot = root.right;
    root.right = root.right.left;
    newRoot.left = root;
    
    return newRoot;
    
  }
  
  private int height(Node root) {

    if(root == null) {
      return -1;
    }

    return Math.max(height(root.left), height(root.right))+1;

  }
}
