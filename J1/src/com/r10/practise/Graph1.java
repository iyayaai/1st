package com.r10.practise;



public class Graph1 {
	int sum;
	int n;
	int[] book;
	int[][] e;
	
	public void dfs(int cur) {
		System.out.printf("%d ", cur);
		sum++;
		if (sum == n) 
			return;
		for (int i = 1; i <= n; i++) {
			if(e[cur][i] == 1 && book[i] == 0) {
				book[i] = 1;
				dfs(i);
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		int m = 5; 
		int n = 5;
		int[][] e = new int[n+1][n+1]; 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == j) {
					e[i][j] = 0;
				} else {
					e[i][j] = 999;
				}
			}
		}
		System.out.println();
		System.out.println(e);
		for (int[] is : e) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		
		
	}

}
