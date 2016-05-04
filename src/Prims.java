public class Prims {
	public static void index(int[][] graph, int n) {
		boolean[] visited = new boolean[n];

		int u = 0, v = 0, total = 0;
		visited[0] = true;
		for(int i=0;i<n-1; i++){
			int min = 999;
			for(int j=0;j<n;j++){
                if(visited[j]){
                    for(int k=0;k<n;k++){
                        if(!visited[k] && min > graph[j][k]){
                            min = graph[j][k];
                            u = j;
                            v = k;
                        }
                    }
                }
			}
			visited[v] = true;
			total += min;
			graph[u][v] = graph[u][v] = 999;
			System.out.println("Edge connected: "+u+" -> "+v+" : "+min);
		}
		System.out.println("The total weight "+ total);
	}
}
