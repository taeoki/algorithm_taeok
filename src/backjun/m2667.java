package backjun;

import java.util.*;

public class m2667 {
	/*
	 * 첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 
	 * 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
	 * 
	 * 첫 번째 줄에는 총 단지수를 출력하시오. 
	 * 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
	 * 
	 * 7
	 * 0110100
	 * 0110101
	 * 1110101
	 * 0000111
	 * 0100000
	 * 0111110
	 * 0111000
	 */
	
	LinkedList<node> queue = new LinkedList<node>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cell[][] = new int[n][n];
		boolean visited[][] = new boolean[n][n];
		
		sc.nextLine();
		for(int a=0; a<n; a++)
		{
			String command;
			command = sc.nextLine();
			
			for(int b=0; b<n; b++)
				cell[a][b] = command.charAt(b)-'0';
		}
		
		for(int a=0; a<n; a++)
		{
			for (int b=0; b<n; b++)
				System.out.print(cell[a][b]);
			System.out.println();
		}
		
		
		
		 
		
	}
	
	public static void BFS(int x, int y)
	{
		//queue.add
	}
	
	
	
	
}
class node {
	int x;
	int y;
	
	public void add(int xx, int yy)
	{
		x= xx;
		y= yy;
	}
}
