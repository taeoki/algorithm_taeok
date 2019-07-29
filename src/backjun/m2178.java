package backjun;


import java.util.*;

public class m2178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 가로
		int m = sc.nextInt();	// 세로
		sc.nextLine();
		
		int miro[][] = new int[n+1][m+1];
		
		for(int a = 1; a < n+1; a++)
		{
			String str = sc.nextLine();
			for (int b=1; b < m+1; b++)
			{
				miro[a][b] = str.charAt(b) - '0';
			}
		}
		
		// 벽을 넘지 않으면서, 방문하지 않은 노드를 방문해야함. 
	}
}
