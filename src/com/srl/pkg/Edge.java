package com.srl.pkg;

public class Edge {
	 
	 //private double weight;
	 private Vertex startVertex;
	 private Vertex targetVertex;
	 private double Time;
	 
	 public Edge(double time, Vertex startVertex, Vertex targetVertex) {
	   this.Time = time;
	   this.startVertex = startVertex;
	   this.targetVertex = targetVertex;
	 }
	 
	 public double getTime() {
	 	return this.Time;
	 }
	 
	 public void setTime(double Time) {
		 this.Time = Time;
	 }
	 
	 public Vertex getStartVertex() {
		 return startVertex;
	 }
	 
	 public void setStartVertex(Vertex startVertex) {
		 this.startVertex = startVertex;
	 }
	 
	 public Vertex getTargetVertex() {
		return targetVertex;
	 }
	 
	 public void setTargetVertex(Vertex targetVertex) {
		 this.targetVertex = targetVertex;
	 }
}