package com.examples.ds.graph;

public class GraphAdjMatrix {

  private int v;
  private int[][] adjMatrix;
  
  public GraphAdjMatrix(int v) {
    adjMatrix = new int[v][v];
  }
  
  public void addEdge(int src, int dest, int value) {
    
    adjMatrix[src][dest] = value;
    
  }
  
  public int getEdge(int src, int dest) {
    
    return adjMatrix[src][dest];
    
  }
  
}
