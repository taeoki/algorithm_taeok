package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class m13460 {
	public static final int WALL = 2;
	public static char[] ALPHABET = {'.', '#', 'O', 'R', 'B'};
	// 벽은 
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String strTemp = sc.readLine();
		String[] wr = strTemp.split(" ");
		
		//세로 , 가로 
		int n = Integer.parseInt(wr[0]);
		int m = Integer.parseInt(wr[1]);
		
		char game[][] = new char[n-WALL][m-WALL];
		
		sc.readLine();	
		
		for(int a=0; a<n-WALL; a++)
		{
			strTemp = sc.readLine();
			System.out.println(strTemp);
			
			int index = 0;
			
			for(int b=1; b<m-1; b++)
			{
				
				game[a][index] = strTemp.charAt(b);
				/*
				if( strTemp.charAt(b)==ALPHABET[0] )	// . -> 0
					game[a][b] = 0;
				else if( strTemp.charAt(b) == ALPHABET[1] )	// # -> 1
					game[a][b] = 1;
				else if( strTemp.charAt(b) == ALPHABET[2] )	// 0 -> 9
					game[a][b] = 9;
				else if( strTemp.charAt(b) == ALPHABET[3] )	// R -> 3
					game[a][b] = 3;
				else if( strTemp.charAt(b) == ALPHABET[4] )	// B -> 4
					game[a][b] = 4;
				*/
				index++;
			}
		}
		
		for(int a=0; a<n-WALL; a++)
		{
			for(int b=0; b<m-WALL; b++)
			{
				System.out.print(game[a][b]);
			}
			System.out.println();
		}
		
	}
	
	public static void DFS(int count, int game[][], String beforeMoved) {
		if(count == 11)
		{
			
		}
		else 
		{
			// 상
			if(!beforeMoved.contains("up"))
			{
				
			}
			// 하
			// 좌
			// 우
		}
	}
	
	public static void move() {
		
	}
}
