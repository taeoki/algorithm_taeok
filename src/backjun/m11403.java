package backjun;

import java.util.*;
public class m11403 {
	
	static LinkedList<Integer> node[];
	static int result[][];
	//static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		node = new LinkedList[n+1];
		result = new int[n+1][n+1];
		
		// [a][b]
		for(int a=1; a<=n; a++)
		{
			node[a] = new LinkedList<Integer>();
			for(int b=1; b<=n; b++)
			{
				int num = sc.nextInt();
				
				// 1일 때,입
				if(num == 1)
					node[a].add(b);
				
			}
		}
		
		for(int a=1; a<=n; a++)
		{
			for(int b=0; b<node[a].size(); b++)
			{
				boolean visited[] = new boolean[n+1];
				dfs(a, node[a].get(b) , visited);
			}
		}
		
		//	출력 
		for(int a=1; a<=n; a++)
		{
			for(int b=1; b<=n; b++)
			{
				System.out.print(result[a][b]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void dfs(int kijun , int next , boolean[] visited)
	{
		if(!visited[next])
		{
			visited[next] = true;
			result[kijun][next] = 1;
			//System.out.println(kijun+"/"+next+" = 1");
			
			for(int i=0; i<node[next].size(); i++)
			{
				dfs(kijun, node[next].get(i) , visited);
			}
		}
	}
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/taeoki/javaAlgorithm.git
