package programmers;

public class 아파트기지국 {
	static int n;
	static int w;
	static int answer = 0;
	public static void main(String[] args) {
		n = 16;
		int[] stations = {9};
		w = 2;
		
		boolean visited[] = new boolean[n+1];
		for(int a = 0; a<stations.length; a++)
			visited[stations[a]] = true;	// 기지국이 있을 때 true
		
		for( int i=1; i<n; i++)
		{
			dfs(i, 0, visited);
			if(answer > 0)
			{
				//return answer;
				System.out.println(answer);
				break;
			}
		}	
		
		//return answer;
	}
	
	public static void dfs(int depth, int cDepth, boolean []origin)
	{
		boolean visited[] = origin.clone();
		if(cDepth == depth)
		{
			for(int i=1; i<=n; i++)
			{
				if(origin[i] == true)
				{
					for(int a = 1; a<=w; a++ )
					{
						if(i-a >= 1)
							visited[i-a] = true;
						if(i+a <= n)
							visited[i+a] = true;
					}
				}
			}
			int trueCount = 0;
			for(int i=1; i<=n; i++)
			{
				if(visited[i])
					trueCount++;
			}
			if (trueCount == n)
				answer = depth;
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if(origin[i] == false)
				{
					origin[i] = true;
					dfs(depth, cDepth+1, origin);
					origin[i] = false;
				}
			}
		}
		
	}
}
