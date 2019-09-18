package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
/*
 * 첫째 줄에는 어떤 지역을 나타내는 2차원 배열의 행과 열의 개수를 나타내는 수 N이 입력된다. 
 * N은 2 이상 100 이하의 정수이다. 둘째 줄부터 N개의 각 줄에는 2차원 배열의 첫 번째 행부터 N번째 행까지 순서대로 한 행씩 높이 정보가 입력된다.
 * 각 줄에는 각 행의 첫 번째 열부터 N번째 열까지 N개의 높이 정보를 나타내는 자연수가 빈 칸을 사이에 두고 입력된다.
 * 높이는 1이상 100 이하의 정수이다.
 */
/*
5
6 8 2 6 2
3 2 3 4 6
6 7 3 3 2
7 2 5 3 6
8 9 5 2 7*/
//5
public class m2468 {
	static int maxHigh = 0;
	static int maximum = 0;
	static int array[][];
	//static boolean boolArray[][];
	static int count;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		String strTemp = sc.readLine();
		
		N = Integer.parseInt(strTemp);
		
		array = new int[N][N];
		
		for(int a=0; a<N; a++)
		{
			strTemp = sc.readLine();
			String temp[] = strTemp.split(" ");
			for(int b=0; b<N; b++)
			{
				array[a][b] = Integer.parseInt(temp[b]);
				if ( array[a][b] > maxHigh )
					maxHigh = array[a][b];
			}
		}
		
		for(int max=0; max<maxHigh; max++)
		{
			boolean [][] boolArray = new boolean[N][N];
			count = 0;
			for(int a=0; a<N; a++)
			{
				for(int b=0; b<N; b++)
				{
					if(array[a][b] > max && boolArray[a][b]==false)
					{
						dfs(a,b,max,boolArray);
						count++;
					}
				}
			}
			prq.add(count);
		}
		System.out.println(prq.poll());
		
	}
	
	public static void dfs(int a, int b , int max , boolean[][] boolArray) 
	{
		boolArray[a][b] = true;	
		//상
		if(a+1 < N)
		{
			if(array[a+1][b] > max && boolArray[a+1][b] == false)
				dfs(a+1,b,max,boolArray);
		}
		//하
		if(a-1 >= 0)
		{
			if(array[a-1][b] > max && boolArray[a-1][b] == false)
				dfs(a+1,b,max,boolArray);
		}
		//좌
		if(b+1 < N)
		{
			if(array[a][b+1] > max && boolArray[a][b+1] == false)
				dfs(a+1,b,max,boolArray);		
		}
		//우
		if(b-1 >= 0)
		{
			if(array[a][b-1] > max && boolArray[a][b-1] == false)
				dfs(a+1,b,max,boolArray);
		}
		
		
	}
}
