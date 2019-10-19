package programmers;

public class 땅따먹기 {
	static int max = 0;
	public static void main(String[] args) {
		int [][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		int n = land.length;
		
		for(int i=0; i<land[0].length; i++) {
			int sum = land[0][i];
			dfs(n, 1, i, land, sum );
		}
		System.out.println(max);
	}
	public static void dfs(int n, int depth, int idx, int[][] land, int sum)
	{
		if(depth == n)
		{
			if ( sum > max )
				max = sum;
		}
		else
		{
			for(int i=0; i<land[depth].length; i++)
			{
				if(i != idx)
				{
					int ssum = sum + land[depth][i];
					dfs(n, depth+1, i, land, ssum);
				}
				
			}
		}
	}
	
}
