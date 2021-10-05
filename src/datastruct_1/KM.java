//package datastruct_1;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//class Edge implements Comparable<Edge>{
//	char v1,v2;
//	int cost;
//	
//	Edge(char from,char to,int cost){
//		this.v1=from;
//		this.v2=to;
//		this.cost=cost;
//	}
//
//	@Override
//	public int compareTo(Edge o) {
//		// TODO Auto-generated method stub
//		return this.cost - o.cost;
//	}
//	
//}
//public class KM {
//	
//	private static ArrayList<Edge> edgeList;
//	private static char[] parent;
//
//	public static void union(char x,char y) {
//		x = find(x);
//		y = find(y);
//		
//		if(x!=y) {
//			parent[y]=x;
//		}
//	}
//	public static char find(char x) {
//		if(parent[x]==x) {
//			return x;
//		}
//		return parent[x]=find(parent[x]);
//	}
//	public static boolean isSameParent(char x,char y) {
//		x=find(x);
//		y=find(y);
//		if(x==y) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	public static void main(String[] args) {
//		edgeList = new ArrayList<Edge>();
//		edgeList.add(new Edge('A','B',8));
//		edgeList.add(new Edge('A','H',5));
//		edgeList.add(new Edge('A','F',10));
//		edgeList.add(new Edge('B','F',4));
//		edgeList.add(new Edge('B','H',4));
//		edgeList.add(new Edge('B','C',4));
//		edgeList.add(new Edge('B','E',4));
//		edgeList.add(new Edge('C','F',3));
//		edgeList.add(new Edge('C','D',3));
//		edgeList.add(new Edge('D','F',6));
//		edgeList.add(new Edge('D','G',2));
//		edgeList.add(new Edge('D','E',1));
//		edgeList.add(new Edge('E','G',3));
//		edgeList.add(new Edge('G','H',3));
//		
//		parent = new char[100];
//		
//		for (int i = 1; i < 99; i++) {
//			parent[i] = (char) ((char)94+i);
//		}
//		
//		Collections.sort(edgeList);
//		
//		int sum = 0;
//		for(int i=0;i<edgeList.size();i++) {
//			Edge edge = edgeList.get(i);
//			if(!isSameParent(edge.v1, edge.v2)) {
//				System.out.println(" "+edge.v1+" "+edge.v2);
//				sum+=edge.cost;
//				
//				union(edge.v1, edge.v2);
//			}
//		}
//		System.out.println(sum);
//		
//		
//	}
//}
