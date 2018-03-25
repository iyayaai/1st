package bfshome2;

import java.util.HashMap;
import java.util.List;



public class Graph {
	private List<String> vertexAll;
	private String firstVertex;
	HashMap<String, List<String>> adj = new HashMap<>();
	
	// getter, setter
	public List<String> getVertexAll() {
		return vertexAll;
	}
	public void setVertexAll(List<String> vertexAll) {
		this.vertexAll = vertexAll;
	}
	public String getFirstVertex() {
		return firstVertex;
	}
	public void setFirstVertex(String firstVertex) {
		this.firstVertex = firstVertex;
	}
	public HashMap<String, List<String>> getAdj() {
		return adj;
	}
	public void setAdj(HashMap<String, List<String>> adj) {
		this.adj = adj;
	}
}
