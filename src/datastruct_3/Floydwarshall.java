package datastruct_3;
class AllshortestPath{
	public void floydWarshall(int graph[][],int V) {
		int dist[][]=new int[V][V];
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				dist[i][j]=graph[i][j];
			}
		}
		for(int k=0;k<V;k++) {
			for(int i=0;i<V;i++) {
				for(int j=0;j<V;j++) {
					if(dist[i][k]+dist[k][j]<dist[i][j]) {
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				System.out.print(" "+dist[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
public class Floydwarshall {
	
	public static void main(String[] args) {
		
		int INF=99;
		int graph[][]= {
				{0,2,9,INF},
				{5,0,4,3},
				{-1,INF,0,4},
				{INF,1,7,0}
				
		};
		int V=4;
		AllshortestPath a=new AllshortestPath();
		a.floydWarshall(graph,V);
	}
}
