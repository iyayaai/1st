package bfshome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	private List<String> vertexAll;
	private String firstVertex;
	HashMap<String, List<String>> adj = new HashMap<>();
	
	
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
	
	
	private BFS algo = new BFS();
//	algo.bfs(this, firstVertex);
	Map<String, String> path = algo.getPath();
	
	public Stack<String> findPathTo(String vertexGoal) {
		Stack<String> stack = new Stack<>();
		stack.add(vertexGoal);
		
		algo.bfs(this, firstVertex);
//		Map<String, String> path = algo.bfs(this, firstVertex);
		Map<String, String> path = algo.getPath();
		System.out.println(path);
		
		for(String location = path.get(vertexGoal); 
				location.equals(firstVertex) == false; 
				location = path.get(location)) {
			stack.push(location);
		}
		stack.push(firstVertex);
		return stack;
		
	}
	
	
	
	
	
}
