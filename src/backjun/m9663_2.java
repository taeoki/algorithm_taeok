package backjun;

import java.util.*;
public class m9663_2 {
	static int n;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		count = 0;
		for(int i=1; i<=n; i++)
		{
			int chess[][] = new int[n+1][n+1];
			
			chess[1][i] = 1;
			
			dfs(chess, 1);
	
		}
		System.out.println(count);
	}
	
	public static void dfs (int chess[][], int row)
	{
		System.out.println("chess-row : "+row );
		
		if(row == n )
		{
			count++;
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				System.out.println("chess-row : "+row +" ver: "+i);
				chess[row+1][i] = 1;
				
				
				int sum = 0;
				
				// 대각선에 있으면 안됨 
				
				// 좌 감소 대각선 
				int row_k = row;
				int ver_k = i-1;
				
				while(row_k >= 1 && ver_k >= 1 )
				{
					
					sum += chess[row_k][ver_k];
					
					row_k--;
					ver_k--;
				}
				
				// 우 감소 대각선
				row_k = row;
				ver_k = i+1;
				
				while(row_k >= 1 && ver_k <= n)
				{
					sum += chess[row_k][ver_k];
					
					row_k--;
					ver_k++;
				}
				
				// 
				row_k = row;
				ver_k = i;
				
				while(row_k>=1)
				{
					sum += chess[row_k][ver_k];
					row_k--;
				}
				
				if(sum==0)
				{
					
					System.out.println("row:"+row);
					dfs(chess, row+1);
				}
					
				chess[row+1][i] = 0;
			}
		}
	}
	
}
