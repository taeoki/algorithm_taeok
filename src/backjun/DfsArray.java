package backjun;
import java.util.*;
public class DfsArray {
	static int nE;
	static int nV;
	static int[][] adj;
	static boolean[] visited;
	
	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i+" ");
		
		for(int j = 1; j<nV+1; j++)
		{
			if ( adj[i][j] == 1 && visited[j] == false) 
			{
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nV = sc.nextInt();
		nE = sc.nextInt();
		
		adj = new int[nV+1][nV+1];
		visited = new boolean[nV+1];
		
		for (int i=0; i < nE; i++)
		{
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			
			adj[t1][t2] = 1;
			
		}
	}
}
