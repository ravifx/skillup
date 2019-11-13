package com.examples.ds.tree;

import java.util.Stack;

public class BinaryTree {
  
  Node root;
  
  public BinaryTree(){
    root = null;
  }
  
  public boolean isEmpty() {
    return root == null;
  }
  
  public void insert(int data) {
    root = insert(root, data);
  }
  
  private Node insert(Node node, int data) {
    
    if(node == null) {
      node = new Node(data);
    }else if(node.right == null) {
      node.right = insert(node.right, data);
    }else {
      node.left = insert(node.left, data);
    }
    
    return node;
  }
  
  public int nodeCount() {
    return nodeCount(root);
  }
  
  private int nodeCount(Node node) {
    
    if(node == null) {
      return 0;
    } else {
      
      return nodeCount(node.left)+nodeCount(node.right)+1;
      
    }
    
  }
  
  public boolean search(int data) {
    return search(root, data);
  }
  
  private boolean search(Node node, int data) {
    
    if(node == null) {
      return false;
    } else if(node.data == data) {
      return true;
    } else {
      return search(node.left, data) || search(node.right, data);
    } 
    
  }
  
  public void inorder() {
    inorder(root);
  }
  
  private void inorder(Node node) {
    
    if(node != null) {
      inorder(node.left);
      System.out.print(node.data);
      System.out.print(" ");
      inorder(node.right);
    }
    
  }
  
  public void preorder() {
    preorder(root);
  }
  
  private void preorder(Node node) {
    
    if(node != null) {
      System.out.print(node.data);
      System.out.print(" ");
      inorder(node.left);
      inorder(node.right);
    }
    
  }
  
  public void postorder() {
    postorder(root);
  }
  
  private void postorder(Node node) {
    
    if(node != null) {
      inorder(node.left);
      inorder(node.right);
      System.out.print(node.data);
      System.out.print(" ");
    }
    
  }
  
  public String order() {
    return order(root);
  }
  
  private String order(Node node) {
    
    if(node != null) {
      return order(node.left) + order(node.right) + node.data + " ";
    }else {
      return "";
    }
    
  }
  
  public Stack orderStack() {
    return orderStack(root);
  }
  
  private Stack orderStack(Node node) {
    
    if(node != null) {
      Stack ss = orderStack(node.left);
      ss.addAll(orderStack(node.right));
      ss.push(node.data);
      return ss;
    }else {
      return new Stack();
    }
    
  }
  
  
  
  
  
  
  
  
  
  
}
