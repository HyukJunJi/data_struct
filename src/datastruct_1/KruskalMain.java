package datastruct_1;
import java.util.ArrayList;
import java.util.Collections;
class Edge implements Comparable<Edge>{
	int v1,v2,cost;
	
	Edge(int from,int to,int cost){
		this.v1=from;
		this.v2=to;
		this.cost=cost;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
	
}
public class KruskalMain {
	
	private static ArrayList<Edge> edgeList;
	private static int[] parent;

	public static void union(int x,int y) {
		x = find(x);
		y = find(y);
		
		if(x!=y) {
			parent[y]=x;
		}
	}
	public static int find(int x) {
		if(parent[x]==x) {
			return x;
		}
		return parent[x]=find(parent[x]);
	}
	public static boolean isSameParent(int x,int y) {
		x=find(x);
		y=find(y);
		if(x==y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		edgeList = new ArrayList<Edge>();
		edgeList.add(new Edge(1,2,8));
		edgeList.add(new Edge(1,8,5));
		edgeList.add(new Edge(1,6,10));
		edgeList.add(new Edge(2,6,4));
		edgeList.add(new Edge(2,8,4));
		edgeList.add(new Edge(2,3,4));
		edgeList.add(new Edge(2,5,4));
		edgeList.add(new Edge(3,6,3));
		edgeList.add(new Edge(3,4,3));
		edgeList.add(new Edge(4,6,6));
		edgeList.add(new Edge(4,7,2));
		edgeList.add(new Edge(4,5,1));
		edgeList.add(new Edge(5,7,3));
		edgeList.add(new Edge(7,8,3));
		
		parent = new int[9];
		
		for (int i = 1; i <= 7; i++) {
			parent[i] = i;
		}
		
		Collections.sort(edgeList);
		
		int sum = 0;
		for(int i=0;i<edgeList.size();i++) {
			Edge edge = edgeList.get(i);
			if(!isSameParent(edge.v1, edge.v2)) {
				System.out.println(" "+edge.v1+" "+edge.v2);
				sum+=edge.cost;
				union(edge.v1, edge.v2);
			}
		}
		System.out.println(sum);
		
		
	}
}
