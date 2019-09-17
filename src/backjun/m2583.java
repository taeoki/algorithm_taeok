package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class m2583 {
	static int array[][];
	static int areaCount;
	static int area;
	static int M,N;
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
		String strTemp = sc.readLine();
		
		String temp[] = strTemp.split(" ");
		
		M = Integer.parseInt(temp[0]);
		N = Integer.parseInt(temp[1]);
		int K = Integer.parseInt(temp[2]);
		
		array = new int[M][N];
		
		areaCount = 0;
		
		for(int a=0; a<K; a++)
		{
			strTemp = sc.readLine();
			String[] location = strTemp.split(" ");
			int startX = Integer.parseInt(location[0]);
			int startY = Integer.parseInt(location[1]);
			int endX = Integer.parseInt(location[2]);
			int endY = Integer.parseInt(location[3]);
			rectangle(startX,startY,endX,endY);
		}
		
		for(int a=0; a<M; a++ )
		{
			for(int b=0; b<N; b++)
			{
				if(array[a][b] == 0)
				{
					area=0;
					areaCount++;
					dfs(a,b);
					
					prq.add(area);
					
				}	
			}
		}
		System.out.println(+areaCount);
		if(prq.size() != 0)
		{
			while(prq.size()!= 0)
			{
				System.out.print(prq.poll()+" ");	
			}
		}
		else 
		{
			System.out.println(0);
		}
		
	}
	
	public static void dfs(int a, int b) 
	{
		area++;
		array[a][b] = 1;
		
		//상
		if(a+1 < M)
		{
			if(array[a+1][b] == 0)
				dfs(a+1,b);
		}
		//하
		if(a-1 >= 0)
		{
			if(array[a-1][b] == 0)
				dfs(a-1,b);
		}
		//좌
		if(b+1 < N)
		{
			if(array[a][b+1] == 0)
				dfs(a,b+1);
		}
		//우
		if(b-1 >= 0)
		{
			if(array[a][b-1] == 0)
				dfs(a,b-1);
		}
		
		
	}
	
	public static void rectangle(int startX, int startY, int endX, int endY )
	{
		for(int a=startX; a<endX; a++)
		{
			for(int b=startY; b<endY; b++)
			{
				array[b][a] = 1;
			}
		}
	}
}
