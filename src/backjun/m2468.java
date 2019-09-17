package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m2468 {
	static int maxHigh = 0;
	static int maximum = 0;
	static boolean boolArray[][];
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String strTemp = sc.readLine();
		
		int N = Integer.parseInt(strTemp);
		
		int array[][] = new int[N][N];
		
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
		
	}
	
	public static void dfs(int a, int b , int max) 
	{
		
		
		
		
		
	}
}
