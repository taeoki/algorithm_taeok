package backjun;

import java.util.*;
public class m14502 {
	/*
	 * 첫째 줄에 지도의 세로 크기 N과 가로 크기 M이 주어진다. (3 ≤ N, M ≤ 8)
	 * 둘째 줄부터 N개의 줄에 지도의 모양이 주어진다. 
	 * 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 위치이다. 
	 * 2의 개수는 2보다 크거나 같고, 10보다 작거나 같은 자연수이다.
	 * 빈 칸의 개수는 3개 이상이다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 세로 크기
		int m = sc.nextInt();	// 가로 크기
		
		int arr[][] = new int[n][m];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				int tmp = sc.nextInt();
				
				if(tmp == 2)	// 버그
					arr[i][j] = 2;
				else if(tmp == 1)	// 벽
					arr[i][j] = 1;
			}
		}
		
		
		
		
	}
	
	
}
