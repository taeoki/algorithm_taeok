package backjun;

import java.util.Scanner;

public class m2178_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// ����
		int m = sc.nextInt();	// ����
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
		
		// ���� ���� �����鼭, �湮���� ���� ��带 �湮�ؾ���. 
	}
}
