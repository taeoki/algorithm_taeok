package backjun;

import java.util.*;

public class m1260_Array {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		int array[][] = new int[n+1][n+1];
		
		for(int a=0; a<m; a++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			array[start][end] = 1;
			array[end][start] = 1;
		}
		
		boolean visitedDFS[] = new boolean[n+1];
		
		dfs(n,v,array,visitedDFS);		
		
		
		
	}
	
	public static void dfs(int n, int v, int array[][], boolean visited[])
	{
		visited[v] = true;
		System.out.print(v+" ");
		
		for(int a=1; a<n+1; a++)
		{
			if(array[v][a] == 1 && visited[a] != true)
			{
				dfs(n,a,array,visited);
			}
		}
		
	}
}
