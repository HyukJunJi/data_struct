package datastruct_3;

import java.util.Arrays;

public class bellman_ford {
	public static final int INF=Integer.MAX_VALUE;
	public static void bellmanFord(int num,int [][]adj,int src) {
		
		int[] dists=new int[num];
		Arrays.fill(dists, INF);
//		for(int i=0;i<num;i++) {
//			dists[i]=INF;
//		}
		dists[0]=0;
		for(int v=0;v<num;v++) {
			for(int i=0;i<num;i++) {
				for(int j=0;j<num;j++) {
					if(adj[i][j]!=INF) {
						dists[j]=Math.min(dists[j],dists[i]+adj[i][j]);
					}
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.print(dists[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int num=6;
		int [][]adj=new int [][]{
			{0,6,5,5,INF,INF},
			{INF,0,INF,INF,-1,INF},
			{INF,-2,0,INF,1,INF},
			{INF,INF,-3,0,INF,-1},
			{INF,INF,INF,INF,0,3},
			{INF,INF,INF,INF,INF,0} };
			int src=0;
			bellmanFord(num,adj,src);
	}
}
