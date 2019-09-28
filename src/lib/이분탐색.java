package lib;

public class 이분탐색 {
	public static void main(String[] args) {
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		int budgetSum = 0;
		boolean con = true;
		
		// 모든 요청이 배정 될 수있는 경우 - 최댓값 x 4 < M
		int max = budgets[0];
		budgetSum += max;
		
		for(int i=1; i<budgets.length; i++)
			if(max < budgets[i])
			{
				budgetSum += budgets[i];
				max = budgets[i];
			}
		int start = 0;
		int end = max;
		int temp = 0;
		
		while(start <= end)
		{ 
			
			int mid = (start + end) / 2;
			int sum = 0;
			
			for(int i=0; i<budgets.length; i++)
			{
				if(budgets[i] > mid)
					sum += mid;
				else
					sum += budgets[i];
			}
			System.out.println("sum:"+sum);
			System.out.println("mid:"+mid);
			
			if(sum == M)
			{
				break;
			}
			else if(sum <= M)
			{
				start = mid;
			}
			else 
				end = mid;
			
			if(temp == mid)
				break;
			
			temp = mid;
		}
			
	}
}
