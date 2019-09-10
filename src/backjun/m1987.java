package backjun;

import java.util.*;
public class m1987 {
/*
 * 세로 R칸, 가로 C칸으로 된 표 모양의 보드가 있다. 
 * 보드의 각 칸에는 대문자 알파벳이 하나씩 적혀 있고, 좌측 상단 칸 (1행 1열) 에는 말이 놓여 있다.
 * 말은 상하좌우로 인접한 네 칸 중의 한 칸으로 이동할 수 있는데, 
 * 새로 이동한 칸에 적혀 있는 알파벳은 지금까지 지나온 모든 칸에 적혀 있는 알파벳과는 달라야 한다. 
 * 즉, 같은 알파벳이 적힌 칸을 두 번 지날 수 없다.
 * 
 * 좌측 상단에서 시작해서, 말이 최대한 몇 칸을 지날 수 있는지를 구하는 프로그램을 작성하시오. 
 * 말이 지나는 칸은 좌측 상단의 칸도 포함된다.
 */
	
	/*
	 * 첫째 줄에 R과 C가 빈칸을 사이에 두고 주어진다. (1<=R,C<=20) 둘
	 * 째 줄부터 R개의 줄에 걸쳐서 보드에 적혀 있는 C개의 대문자 알파벳들이 빈칸 없이 주어진다.
	 */
	/*
2 4
CAAB
ADCB		
	 */
	static int r;
	static int c;
	static int max;
	public static void main(String[] args) {
		max = 0;
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		sc.nextLine();
		
		char [][] alpha = new char[r][c];
		
		for(int i=0; i<r; i++)
		{
			String msg = sc.nextLine();
			
			for(int j=0; j<c; j++)
				alpha[i][j] = msg.charAt(j);
		}
		dfs( 0 , 0 , alpha , String.valueOf( alpha[0][0]) );
		
		System.out.println(max);
		
		
	}
	
	public static void dfs( int x, int y , char[][]alpha, String str )
	{
		//System.out.println("x:"+x + " y:"+y+" str:"+str);
		
		
		//-- 좌로 이동
		if( x-1 >= 0 )
		{
			if ( !str.contains( String.valueOf(alpha[y][x-1]) ) )			
				dfs(x-1, y, alpha, str+String.valueOf(alpha[y][x-1]) );
			
			
		}
		else
		{
			if( max < str.length())
				max = str.length();
		}
		
		
		//-- 우로 이동
		if( x+1 < c )
		{
			
			if ( !str.contains( String.valueOf(alpha[y][x+1]) ) )			
				dfs(x+1, y, alpha, str+String.valueOf(alpha[y][x+1]) );
			
			
		}
		else
		{
			if( max < str.length())
				max = str.length();
		}
		
		//-- 상으로 이동
		if( y-1 >= 0 )
		{
			if (!str.contains( String.valueOf(alpha[y-1][x]) ) )
				dfs(x, y-1, alpha, str+String.valueOf(alpha[y-1][x]) );
			
		}
		else
		{
			if( max < str.length())
				max = str.length();
		}
		
		
		//-- 하로 이동 
		if( y+1 < r )
		{
			if (!str.contains( String.valueOf(alpha[y+1][x]) ) )
				dfs(x, y+1, alpha, str+String.valueOf(alpha[y+1][x]) );
			
		}
		else
		{
			if( max < str.length())
				max = str.length();
		}
	}
}
