package bfshome2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import bfshome2.Graph;

public class BFS {
	
//	public void bfs(Graph g) {
	private Map<String, String> bfs(Graph g) {
		String firstVertex = g.getFirstVertex();
		
		Queue<String> queue = new LinkedList<>();
		queue.add(firstVertex);
		
		List<String> visitedVertex = new ArrayList<>();
		visitedVertex.add(firstVertex);
		
		Map<String, String> path = new HashMap<>();
		
		while(queue.isEmpty()==false) {
			String vertexPoll = queue.poll();
			List<String> toVisit = g.getAdj().get(vertexPoll);
			for(String v: toVisit) {
				if(visitedVertex.contains(v)==false) {
					visitedVertex.add(v);
					queue.add(v);
					path.put(v, vertexPoll);			//要的就是这个path
				}
			}
		}
//		System.out.println(path);			
		return path;
	}
	
	
	public Stack<String> findPath(Graph g, String vertexStart, String vertexEnd) {
//		Graph g = new Graph();              xxx
		g.setFirstVertex(vertexStart);
		
		Stack<String> stack = new Stack<>();
		stack.add(vertexEnd);
		
		Map<String, String> path = bfs(g);
		System.out.println(path);				////////////
		
		for(String location = path.get(vertexEnd); 
				location.equals(vertexStart) == false; 
				location = path.get(location)) {
			stack.push(location);
		}
		stack.push(vertexStart);
		return stack;
	}
	
	
}
