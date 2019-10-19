package programmers;

public class 소수의개수 {
	static int count = 0;
	public static void main(String[] args) {
		int nums[] = {1,2,7,6,4};
		boolean visited[] = new boolean[nums.length];
		
		for(int i=0; i<nums.length; i++)
		{
			dfs(0, i, nums, visited)
		}
		
		
		dfs(0,0,nums,visited,0);
		System.out.println(count);
		
	}
	public static void dfs(int depth, int start, int nums[], boolean visited[], int sum)
	{
		if(depth == 3)
		{
			sosu(sum);
		}
		else
		{
			for(int i=start; i<nums.length; i++)
			{
				if(visited[i] == false)
				{
					visited[i] = true;
					sum += nums[i];
					dfs(depth+1, start+1,nums,visited,sum);
					visited[i] = false;
					sum -= nums[i];
				}
			}
		}
	}
	public static void sosu(int n)
	{
		int flag = 0;
		// 
		// 0일 때, 
		// 1일 때, 
		// 2이상일 때,
		
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
				flag++;
		}	
		if(flag == 0)
		{
			System.out.println(n);
			count++;
		}
		
		
	}
}
