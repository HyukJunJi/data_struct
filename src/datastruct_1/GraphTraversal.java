//package datastruct_1;
//import java.util.Stack;
//import java.util.LinkedList;
//import java.util.Queue;
//class Node{
//	int data;
//	Node link;
//	public Node(int data,Node tmpNode) {
//		this.data=data;
//		link=tmpNode;
//	}
//}
//class Graph{
//	int N=7; // # of vertices
//	Node header[]=new Node[N];
//	boolean visited[]=new boolean[N]; // true : visited, false : unvisited
//	public void build() {
//		Node tmpNode;
//		tmpNode = new Node(3,null);
//		tmpNode = new Node(2,tmpNode);
//		tmpNode = new Node(1,tmpNode);
//		header[0]=tmpNode;
//		//you can do it this way
//		header[1] = new Node (0, new Node(4,null));
//		header[2] = new Node (0, new Node(4,new Node(5,null)));
//		header[3] = new Node (0, new Node(5,null));
//		header[4] = new Node (1, new Node(5,new Node(6,null)));
//		header[5] = new Node (2, new Node(3,new Node(6,null)));
//		header[6] = new Node (4, new Node(5,null));
//	}
//	public void DFS(int startV) { //startV:start vertex
//		Node tmpNode;
//		int v;
//		for(int i=0;i<N;i++) {
//			visited[i]=false;
//		}
//		Stack s =new Stack();
//		s.push(startV);
//		while(!s.isEmpty()) {//not stack Empty
//			v=(int)s.pop();
//			if(visited[v]==false) {
//				visited[v]=true;
//				System.out.print("->"+v);
//				tmpNode=header[v];
//				while(tmpNode!=null) {
//					if(visited[tmpNode.data]==false) {//adjacent vertex not visited yet
//						s.push(tmpNode.data);
//					}
//					tmpNode=tmpNode.link;
//				}
//			}
//		}
//		System.out.println();
//	}
//	public void BFS(int startV) {
//		Node tmpNode;
//		int v;
//		for(int i=0;i<N;i++) {
//			visited[i]=false;
//		}
//		Queue<Integer> q =new LinkedList();
//		q.add(startV);
//		while(!q.isEmpty()) {//not stack Empty
//			v=(int)q.remove();
//			if(visited[v]==false) {
//				visited[v]=true;
//				System.out.print("->"+v);
//				tmpNode=header[v];
//				while(tmpNode!=null) {
//					if(visited[tmpNode.data]==false) {//adjacent vertex not visited yet
//						q.add(tmpNode.data);
//					}
//					tmpNode=tmpNode.link;
//				}
//			}
//		}
//		System.out.println();
//	}
//	public void printList() {
//		Node tmpNode;
//		for(int i=0;i<N;i++) {
//			tmpNode=header[i];
//			System.out.print(i+" : ");
//			while(tmpNode !=null) {
//				System.out.print("-> "+tmpNode.data);
//				tmpNode=tmpNode.link;
//			}
//			System.out.println();
//		}
//	}
//}
//public class GraphTraversal{
//	public static void main(String[] args) {
//		Graph g1 = new Graph();
//		g1.build();
//		System.out.println("Graph G1");
//		g1.printList();
//		System.out.println("DFS");
//		g1.DFS(0);
//		System.out.println("BFS");
//		g1.BFS(0);
//	}
//}
