package datastruct_1;
class Node{
	int data;
	Node link;
	public Node(int data,Node tmpNode) {
		this.data=data;
		link=tmpNode;
	}
}
class Graph{
	int N=7; // # of vertices
	Node header[]=new Node[N];
	public void build() {
		Node tmpNode;
		tmpNode = new Node(3,null);
		tmpNode = new Node(2,tmpNode);
		tmpNode = new Node(1,tmpNode);
		header[0]=tmpNode;
		//you can do it this way
		header[1] = new Node (0, new Node(4,null));
		header[2] = new Node (0, new Node(4,new Node(5,null)));
		header[3] = new Node (0, new Node(5,null));
		header[4] = new Node (1, new Node(5,new Node(6,null)));
		header[5] = new Node (2, new Node(3,new Node(6,null)));
		header[6] = new Node (4, new Node(5,null));
	}
	public void printList() {
		Node tmpNode;
		for(int i=0;i<N;i++) {
			tmpNode=header[i];
			System.out.print(i+" : ");
			while(tmpNode !=null) {
				System.out.print("-> "+tmpNode.data);
				tmpNode=tmpNode.link;
			}
			System.out.println();
		}
	}
}
public class GraphList {
	public static void main(String[] args) {
		Graph g1 = new Graph();
		g1.build();
		System.out.println("Graph G1");
		g1.printList();
	}
}
