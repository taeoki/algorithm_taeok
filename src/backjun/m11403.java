package backjun;

import java.util.*;
public class m11403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedList<Integer> queue[] = new LinkedList[n+1];
		
		// [a][b]
		for(int a=1; a<=n; a++)
		{
			queue[a] = new LinkedList<Integer>();
			for(int b=1; b<=n; b++)
			{
				int num = sc.nextInt();
				
				if(num == 1)
				{
					queue[a].add(b);
				}
			}
		}
		
		for(int a=1; a<=n; a++)
		{
			boolean visited[] = new boolean[n+1];
			
			
		}
		
		// 데이터가 잘 담겼는지
		/*
		for(int a=1; a<=n; a++)
		{
			System.out.print(a+" : ");
			while(!queue[a].isEmpty())
			{
				System.out.print(queue[a].poll());
			}
			System.out.println();
		}
		*/
	}
	
	public static void dfs(int startEdge, int findEdge , int size, boolean visited[])
	{
		visited[startEdge] = true;
		
		for(int i=1; i<=size; i++)
		{
			
		}
	}
}
