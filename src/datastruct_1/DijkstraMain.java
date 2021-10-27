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
		for(int count=0;count<V;count++) {
			int u=minDistance(dist,visited);
			//System.out.println(u);
			visited[u]=true;
			for(int v=0;v<V;v++) {
				if(!visited[v]&&dist[u]+graph[u][v]<dist[v]) {
					dist[v]=dist[u]+graph[u][v];
				}// dist에다가 그래프 첫번째 줄의 값을 옮기는 역활
			}
			for(int a=0;a<V;a++) {
				System.out.print("dist["+a+"]="+dist[a]);
				if(visited[a]) {
					System.out.print("(O)");
				}
				else {
					System.out.print("(X)");
				}
			}
			System.out.println();
			
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
		int min=99; //graph[][v] 에서v=0~4까지의 값들을 서로 비교해서 최솟 값을 만듬 
		int minIndex=-1;
		for(int v=0;v<V;v++) {
			if(!visited[v]&&dist[v]<=min) {
				min=dist[v];
				//System.out.println(min);
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
			{0,3,8,99,4}, //1
			{99,0,99,1,7}, //2
			{99,4,0,99,99},//3
			{2,99,5,0,99},//4
			{99,99,99,6,0}//5
		};
		Dijkstra g1 = new Dijkstra();
		g1.shortestPath(graph,0);
		
	}
}
