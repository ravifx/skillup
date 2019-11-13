package com.examples.ds.tree;

public class BinaryTreeDemo {

  public static void main(String[] args) {

    BinaryTree bt = new BinaryTree();
    
    bt.insert(10);
    bt.insert(20);
    bt.insert(30);
    bt.insert(40);
    bt.insert(50);
    bt.insert(60);
    bt.insert(70);
    bt.insert(80);
    bt.insert(90);
    
    //System.out.println(bt.order());
    
    System.out.println(bt.orderStack());
    
    /*bt.postorder();
    System.out.println();
    bt.inorder();
    System.out.println();
    bt.postorder();*/
    
  }

}
