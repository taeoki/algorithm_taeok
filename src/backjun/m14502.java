package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
7 7
2 0 0 0 1 1 0
0 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 0 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0
0 1 0 0 0 0 0*/

public class m14502 {
	/*
	 * 연구소의 지도가 주어졌을 때 얻을 수 있는 안전 영역 크기의 최댓값을 구하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 지도의 세로 크기 N과 가로 크기 M이 주어진다. (3 ≤ N, M ≤ 8)
	 * 둘째 줄부터 N개의 줄에 지도의 모양이 주어진다. 
	 * 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 위치이다. 
	 * 2의 개수는 2보다 크거나 같고, 10보다 작거나 같은 자연수이다.
	 * 빈 칸의 개수는 3개 이상이다.
	 * 
	 */
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String strTemp = sc.readLine();
		String[] temp = strTemp.split(" ");
		
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		int array[][] = new int[N][M];
		int copyArray[][] = new int[N][M];
		
		LinkedList<dot> emptyArea = new LinkedList<dot>();
		
		// 입력 받아오기
		for (int a=0; a<N; a++)
		{
			strTemp = sc.readLine();
			temp = strTemp.split(" ");
			for (int b=0; b<M; b++)
			{
				array[a][b] =  Integer.parseInt(temp[b]);
			}
		}
		// 벽 세우기 
		
		wall(0,0);
		
		
	}
	public static void wall(int start, int depth)
	{
		if(depth == 3)
		{
			
		}
		else
		{
			for(int i = start; i<N*M; i++) 
			{
				int x = i/M;
				int y = i%M;
				
				if(array[x][y] == 0) {
					
				}
			}
		}
	}
	
	public static void dfs(int start, int depth)
	{
		
	}
}

class dot {
	int x;
	int y;
	
	dot(int a, int b){ x=b; y=a; }
}