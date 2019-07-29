package backjun;

import java.util.*;

public class m1260_Array {
	public void main(String args[])
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
		
		boolean visitedBFS[][] = new boolean[n+1][n+1];
		
		//bfs
		
		for (int a=1; a<=n; a++)
		{
			for(int b=1; b<)
		}
		
		
	}
}
