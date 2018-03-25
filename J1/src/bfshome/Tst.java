package bfshome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;




public class Tst {
	public static void main(String[] args) {
		Graph g = new Graph();
		
		String[] vertexes = {"国贸","双井","九龙山","大望路","四惠","呼家楼","金台夕照","金台路","东大桥","朝阳门",
							"建国门","东单","灯市口","东四","永安里","建国门","北京站","磁器口","崇文门",
							"广渠门内","广渠门外"};
		List<String> vertexAll = new ArrayList<>();
		vertexAll = Arrays.asList(vertexes);
		g.setVertexAll(vertexAll);
//		System.out.println(vertexAll);
//		System.out.println(g.getVertexAll());
		
		String[] a1 = {"国贸","大望路","金台夕照","永安里","双井"};
		String[] a2 = {"双井","国贸","九龙山","广渠门外"};
		String[] a3 = {"九龙山","双井","大望路"};
		String[] a4 = {"大望路","金台路","国贸","四惠","九龙山"};
		String[] a5 = {"四惠","大望路"};
		String[] a6 = {"呼家楼","金台夕照","金台路","东大桥"};
		String[] a7 = {"金台夕照","呼家楼","国贸"};
		String[] a8 = {"金台路","呼家楼","大望路"};
		String[] a9 = {"东大桥","朝阳门","呼家楼"};
		String[] a10 = {"朝阳门","东大桥","建国门","东四"};
		String[] a11 = {"建国门","永安里","东单","朝阳门","北京站"};
		String[] a12 = {"东单","建国门","崇文门","灯市口"};
		String[] a13 = {"灯市口","东单","东四"};
		String[] a14 = {"东四","朝阳门","灯市口"};
		String[] a15 = {"永安里","建国门","国贸"};
		String[] a16 = {"建国门","永安里","北京站","东单","朝阳门"};
		String[] a17 = {"北京站","建国门","磁器口"};
		String[] a18 = {"磁器口","崇文门","广渠门内"};
		String[] a19 = {"崇文门","磁器口","东单","北京站"};
		String[] a20 = {"广渠门内","广渠门外","磁器口"};
		String[] a21 = {"广渠门外","广渠门内","双井"};
		String[][] subway = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21};

		HashMap<String, List<String>> adj = new HashMap<>();
		for(String[] ss: subway) {
			List<String> list = new ArrayList<>();
			for(int i=1; i<ss.length; i++) {
				list.add(ss[i]);
			}
			adj.put(ss[0], list);
		}
		g.setAdj(adj);
		
		System.out.println("getAdj(): " + g.getAdj());
		
//		g.setFirstVertex("朝阳门");
		g.setFirstVertex("呼家楼");
		
//		BFS breadth = new BFS();
//		System.out.println("path: " + breadth.bfs(g, "朝阳门"));
//		breadth.bfs(g, "朝阳门");
		
//		System.out.println(g.findPathTo("广渠门内"));
		System.out.println(g.findPathTo("东单"));
	}
}






//
//public class Tst {
//	public static void main(String[] args) {
//		Graph g = new Graph();
//		
//		String[] vertexes = {"A","B","C","D","E"};
//		List<String> vertexAll = new ArrayList<>();
//		vertexAll = Arrays.asList(vertexes);
//		g.setVertexAll(vertexAll);
////		System.out.println(vertexAll);
////		System.out.println(g.getVertexAll());
//		
//		String[] A = {"A","B","D"};
//		String[] B = {"B","A","C","D"};
//		String[] C = {"C","B","D","E"};
//		String[] D = {"D","B","C","E"};
//		String[] E = {"E","C","D"};
//		String[][] A2E = {A,B,C,D,E};
//		
//		HashMap<String, List<String>> adj = new HashMap<>();
//		for(String[] ss: A2E) {
//			List<String> list = new ArrayList<>();
//			for(int i=1; i<ss.length; i++) {
//				list.add(ss[i]);
//			}
//			adj.put(ss[0], list);
//		}
//		g.setAdj(adj);
////		System.out.println(adj);	// {A=[B, D], B=[A, C, D], C=[B, D, E], D=[B, C, E], E=[C, D]}
//		
//		
//		BFS breadth = new BFS();
//		System.out.println(breadth.bfs(g, "B"));
//		
//	}
//}
//






