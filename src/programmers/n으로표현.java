package programmers;

public class n으로표현 {
	static int answer = 0;
	static int number;
	static boolean flag = false;
	static int N;
	public static void main(String[] args) {
		N = 5;
		number = 12;
		dfs(5,1);
	}
	public static void dfs(int result,int depth)
	{
		if(result == number)
		{
			if(answer == 0)
				answer = depth;
			else 
			{
				if(depth < answer)
					answer = depth;
			}
		}
		else
		{
			if(depth > 8)
				flag = true;
			else
			{
				dfs(result+N , depth+1);
				dfs(result-N , depth+1);
				dfs(result*N , depth+1);
				dfs()
			}
		}
		//덧셈
		
		//뺄셈
		// 나눗셈
		// 곱셈
		// 10의자리
	}
}
