package com.examples.ds;

public class BST {

  TreeNode root;

  public BST() {
    root = null;
  }

  public void insertData(int data) {
    TreeNode newNode = new TreeNode(data);

    if (root == null) {
      root = newNode;
    } else {
      TreeNode current = root;
      while (true) {
        TreeNode parent = current; 
        if (data < current.data) {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newNode;
            break;
          }
        } else {
          current = current.rightChild;
          if (current == null) {
            parent.rightChild = newNode;
            break;
          }
        }
      }
    }
  }

  public boolean find(int data) {
    boolean found = false;
    TreeNode current = root;

    while (current != null) {
      if (data == current.data) {
        found = true;
        break;
      } else if (data < current.data) {
        current = current.leftChild;
      } else {
        current = current.rightChild;
      }
    }

    return found;
  }

  public void printPreOrder(TreeNode root) {
    if (root != null) {
      System.out.println(root.data);
      //print left tree
      printPreOrder(root.leftChild);
      //print right tree
      printPreOrder(root.rightChild);
    }
  }

  public void printInOrder(TreeNode root) {
    if (root != null) {

      //print left tree
      printInOrder(root.leftChild);
      System.out.println(root.data);
      //print right tree
      printInOrder(root.rightChild);
    }
  }
  
  public void printPostOrder(TreeNode root) {
    if (root != null) {

      //print left tree
      printPostOrder(root.leftChild);
      
      //print right tree
      printPostOrder(root.rightChild);
      
      System.out.println(root.data);
    }
  }
  
  public int getSize(TreeNode root) {
    if (root == null)
      return 0;

    return getSize(root.leftChild) + getSize(root.rightChild) + 1;
  }
  
  public int getLeafNodes(TreeNode root) {
    if (root == null)
      return 0;
    
    if (root.leftChild == null && root.rightChild == null)
      return 1;
    
    return getLeafNodes(root.leftChild) + getLeafNodes(root.rightChild);
  }
  
  public int getHalfLeafNodes(TreeNode root) {
    if (root == null)
      return 0;
    
    if ((root.leftChild == null && root.rightChild != null) || (root.leftChild != null && root.rightChild == null))
      return 1;
    
    return getHalfLeafNodes(root.leftChild) + getHalfLeafNodes(root.rightChild);
  }
  
  public int getFullLeafNodes(TreeNode root) {
    int count = 0;
    if (root == null)
      return 0;
    
    if ((root.leftChild != null && root.rightChild != null))
      count++;
    
    return count + getFullLeafNodes(root.leftChild) + getFullLeafNodes(root.rightChild);
  }
  
  public int getSum(TreeNode root) {
    if (root != null) {
      return root.data + getSum(root.leftChild) + getSum(root.rightChild);
    }
    return 0;
  }
}
