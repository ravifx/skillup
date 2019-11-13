package com.examples.ds.graph;

import java.util.LinkedList;

public class GraphAdjList {

  private int v;
  
  private LinkedList<Integer> adjListArray [];
  
  public GraphAdjList(int v) {
    this.v = v;
    adjListArray = new LinkedList[v];
    
    for(int i=0; i < v ;i++) {
      adjListArray[i] = new LinkedList<>();
    }
    
  }
  
  public void addEdge(int src, int dest) {
    
    this.adjListArray[src].add(dest);
    this.adjListArray[dest].add(src);
  }
  
}
