package backjun;
import java.util.*;
public class m11724 {
	static boolean visited[];
	static LinkedList<Integer> node[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점의 갯수 = n 
		int n = sc.nextInt();
		visited = new boolean[n+1];
		//간선의 갯수 = m 
		int m = sc.nextInt();
		
		
		int count = 0;
		
		node = new LinkedList[n+1];
		
		for(int a=1; a<=n; a++)
		{
			node[a] = new LinkedList<Integer>();
		}
		
		for(int b=0; b<m; b++)
		{
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			node[from].add(to);
			node[to].add(from);
		}
		
		for(int i=1; i<=n; i++)
		{
			if(!visited[i])
			{
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}
	
	public static void dfs(int v)
	{
		if(!visited[v])
		{
			visited[v] = true;
			
			for(int n=0; n < node[v].size(); n++)
			{
				dfs(node[v].get(n));
			}
		}
	}
}
