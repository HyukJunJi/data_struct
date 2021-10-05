package datastruct_1;
class Dijkstra{
	int V=5;
	public void shortestPath(int graph[][],int src) {
		int dist[]=new int[V];
		Boolean visited[]=new Boolean[V];
		for(int i=0;i<V;i++) {
			dist[i]=99;
			visited[i]=false;
		}
		dist[0]=0;
		for(int count=0;count<V-1;count++) {
			int u=minDistance(dist,visited);
			visited[u]=true;
			for(int v=0;v<V;v++) {
				if(!visited[v]&&dist[u]+graph[u][v]<dist[v]) {
					dist[v]=dist[u]+graph[u][v];
				}
			}
			
		}
		printShortestPath(dist);
	}
	public void printShortestPath(int dist[]) {
		for(int i=0;i<V;i++) {
			System.out.print(" 0->"+i+" : "+dist[i]);
		}
		System.out.println();
	}
	public int minDistance(int[] dist,Boolean[] visited) {
		int min=99;
		int minIndex=-1;
		for(int v=0;v<V;v++) {
			if(!visited[v]&&dist[v]<=min) {
				min=dist[v];
				minIndex=v;
			}
			//printShortestPath(dist);
		}
		return minIndex;
	}
}
public class DijkstraMain {
	public static void main(String[] args) {
		int graph[][]=new int[][] {
			{0,3,8,99,4},
			{99,0,99,1,7},
			{99,4,0,99,99},
			{2,99,5,0,99},
			{99,99,99,6,0}
		};
		Dijkstra g1 = new Dijkstra();
		g1.shortestPath(graph,0);
	}
}
