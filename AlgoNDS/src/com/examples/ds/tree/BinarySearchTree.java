package com.examples.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

  Node root;

  public BinarySearchTree() {
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
      node = new Node(data);
    } else if(node.data < data) {
      node.right = insert(node.right, data);
    } else {
      node.left = insert(node.left, data);
    }

    return node;
  }

  public void insertIterative(int data) {

    Node node = new Node(data);

    if(root == null) {
      root = node;
    } else {

      Node current = root;

      while(true) {

        Node parent = current;

        if(data < current.data) {
          current = current.left;
          if(current == null) {
            parent.left = new Node(data);
            break;
          }
        } else {
          current = current.right;
          if(current == null) {
            parent.right = new Node(data);
            break;
          }
        }

      }
    }
  }

  public boolean containsNode(int data) {
    return containsNode(root, data);
  }

  private boolean containsNode(Node current, int data) {

    if(current == null) {
      return false;
    }

    if(current.data == data) {
      return true;
    } else {
      return current.data > data ? containsNode(current.left, data) : containsNode(current.right, data);
    }

  }

  public Node deleteNode(int data) {

    return deleteNode(root, data);

  }

  private Node deleteNode(Node current, int data) {

    if(current == null) {
      return null;
    }

    if(current.data == data) {

      if(current.left == null && current.right == null) {
        return null;
      }

      if(current.left == null) {
        return current.right;
      }

      if(current.right == null) {
        return current.left;
      }

      int small = getSmallestData(current.right);
      current.data = small;
      current.right = deleteNode(current.right, small);

      return current;
    }else if(current.data > data) {
      current.left = deleteNode(current.left, data);
      return current;
    }else {
      current.right = deleteNode(current.right, data);
      return current;
    }

  }

  private int getSmallestData(Node node) {

    return node.left == null ? node.data : getSmallestData(node.left);

  }

  public void preOrderTraversalIterative() {

    Stack<Node> stack = new Stack<Node>();

    stack.push(this.root);

    while(!stack.isEmpty()) {
      Node node = stack.pop();

      System.out.print(node.data + " ");

      if(node.right != null) {
        stack.push(node.right);
      }

      if(node.left != null) {
        stack.push(node.left);
      }
    }

  }

  public void inOrderTraversalIterative() {

    Stack<Node> stack = new Stack<Node>();

    Node node = this.root;

    while(true) {

      if(node != null) {
        stack.push(node);
        node = node.left;
      }else {
        if(stack.isEmpty()) {
          break; 
        }
        node = stack.pop();
        System.out.print(node.data + " ");
        node = node.right;
      }
    }
  }

  public void postOrderTraversalIterative() {

    Stack<Node> stack1 = new Stack<Node>();
    Stack<Node> stack2 = new Stack<Node>();

    stack1.push(this.root);

    while(!stack1.isEmpty()) {
      
      Node node = (Node)stack1.pop();
      stack2.push(node);
      
      if(node.left != null) {
        stack1.push(node.left);
      }
      
      if(node.right != null) {
        stack1.push(node.right);
      }
    }

    while(!stack2.isEmpty()) {
      System.out.print(stack2.pop().data + " ");
    }
    
  }
  
  public void levelOrderTraversal() {

    if(root == null) {
      return;
    }

    Queue<Node> nodes = new LinkedList<Node>();

    nodes.add(root);

    while(!nodes.isEmpty()) {

      Node node = nodes.remove();
      System.out.print(node.data + " ");

      if(node.left != null) {
        nodes.add(node.left);
      }
      if(node.right != null) {
        nodes.add(node.right);
      }

    }

  }

  public int height() {
    return height(root);
  }

  private int height(Node root) {

    if(root == null) {
      return -1;
    }

    return Math.max(height(root.left), height(root.right))+1;

  }

  public void zigzagTraversal() {

    if(root == null) {
      return;      
    }

    Stack<Node> currentLevelStack = new Stack<Node>();
    Stack<Node> nextLevelstack = new Stack<Node>();

    boolean isLeftRightReading = true;

    currentLevelStack.push(root);

    while(!currentLevelStack.isEmpty()) {

      Node node = currentLevelStack.pop();

      System.out.print(node.data+" ");

      if(isLeftRightReading) {

        if(node.left != null) {
          nextLevelstack.push(node.left);
        }
        if(node.right != null) {
          nextLevelstack.push(node.right);
        }

      } else {

        if(node.right != null) {
          nextLevelstack.push(node.right);
        }
        if(node.left != null) {
          nextLevelstack.push(node.left);
        }

      }

      if(currentLevelStack.isEmpty()) {
        currentLevelStack = nextLevelstack;
        nextLevelstack = new Stack<Node>();
        isLeftRightReading = !isLeftRightReading;
      }

    }

  }

  public boolean isSame(BinarySearchTree bst) {
    return isSame(this.root, bst.root);
  }

  public boolean isSame(Node root1, Node root2) {

    if(root1 == null && root2 == null) {
      return true;
    }

    if(root2 == null || root2 == null) {
      return false;
    }

    return root1.data == root2.data && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);

  }

  public Node lowestCommonAncestor(int data1, int data2) {
    
    return lowestCommonAncestor(root, data1, data2);
    
  }

  private Node lowestCommonAncestor(Node root, int data1, int data2) {
    
    if(root.data > Math.max(data1, data2)) {
      return lowestCommonAncestor(root.left, data1, data2);
    }else if (root.data < Math.min(data1, data2)) {
      return lowestCommonAncestor(root.right, data1, data2);
    }
    
    return root;
  }
}
