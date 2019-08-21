package backjun;

import java.util.*;
public class m11403 {
	static LinkedList<Integer> queue[];
	static int visited[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		queue = new LinkedList[n+1];
		visited = new int[n+1];
		
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
			for(int b=1; b<=n; b++)
			{
				dfs(a,b);
			}
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
	
	public static void dfs(int from , int to)
	{
		
	}
}
