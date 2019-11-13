package com.examples.ds;

public class ShortestDistenceBtwnTwoNodesInBST {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BST bst = new BST();
    
    bst.insertData(20);
    bst.insertData(10);
    bst.insertData(30);
    bst.insertData(40);
    bst.insertData(5);
    bst.insertData(55);
    bst.insertData(25);
    bst.insertData(35);
    
    //System.out.println(bst.find(15));
    
    System.out.println(getDistance(bst.root, 25, 35));

  }
  
  private static int getDistance(TreeNode root, int first, int second) {
    
    if(root == null || first == second) {
       return 0;
    }
    
    if(root.data > first && root.data > second) {
      return getDistance(root.leftChild, first, second);
    } else if(root.data < first && root.data < second) {
      return getDistance(root.rightChild, first, second);
    } else if(root.data > first && root.data < second) {
      return getDistance(root.leftChild, first, root.data) +1 + getDistance(root.rightChild, root.data, second)+1;
    } else {
      return 0;
    }
    
  }

}
