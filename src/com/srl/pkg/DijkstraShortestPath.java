package com.srl.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
 
public class DijkstraShortestPath {
 
 public void computeShortestPaths(Vertex sourceVertex){
  
  sourceVertex.setDistanceValue(0);
  PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
  priorityQueue.add(sourceVertex);
  sourceVertex.setVisited(true);
  
  while( !priorityQueue.isEmpty() ){
    // Chemain minimum algo
    Vertex actualVertex = priorityQueue.poll();
    
    for(Edge edge : actualVertex.getAdjacenciesList()){
      
      Vertex v = edge.getTargetVertex();
      if(!v.isVisited())
      {
        double newDistance = actualVertex.getDistanceValue() + edge.getTime();
        
        if( newDistance < v.getDistanceValue() ){
          priorityQueue.remove(v);
          v.setDistanceValue(newDistance);
          v.setPredecessor(actualVertex);
          priorityQueue.add(v);
          }
        }
      }
    actualVertex.setVisited(true);
  }
 }
 
 public List<Vertex> getShortestPathTo(Vertex targetVertex){
  List<Vertex> path = new ArrayList<>();
  
  for(Vertex vertex=targetVertex;vertex!=null;vertex=vertex.getPredecessor()){
    path.add(vertex);
  }
  
  Collections.reverse(path);
  return path;
 }
 
}
