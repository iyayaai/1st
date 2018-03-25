package bfshome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS implements Algorithm {

	@Override
	public void perform() {
		
	}

	@Override
	public Map<String, String> getPath() {
		return path;
	}
	
	
	private Map<String, String> path = new HashMap<>();
	
	

	public void bfs(Graph g, String firstVertex) {
//	public Map<String, String> bfs(Graph g, String firstVertex) {
		Queue<String> queue = new LinkedList<>();
		queue.add(firstVertex);
		
		List<String> visitedVertex = new ArrayList<>();
		visitedVertex.add(firstVertex);
		
//		Map<String, String> path = new HashMap<>();
		
		while(queue.isEmpty()==false) {
			String ver = queue.poll();
			List<String> toVisit = g.getAdj().get(ver);
			for(String v: toVisit) {
				if(visitedVertex.contains(v)==false) {
					visitedVertex.add(v);
					queue.add(v);
					path.put(v, ver);
				}
			}
		}
		System.out.println(path);
//		return path;
	}

}
