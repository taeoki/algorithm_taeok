package backjun;

import java.util.*;
import java.io.*;
public class m2178 {
	
	static int arr[][];	// 1,0이 담길 곳
	static int n,m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static LinkedList<Node> adj[][];
	static boolean visited[][];
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][m];
		adj = new LinkedList[n][m];
		visited= new boolean[n][m];
		
		sc.nextLine();
		
		for(int i =0; i<n; i++)
		{
			String str = sc.nextLine();
			
			for(int j=0; j<m; j++)
			{
				arr[i][j] = str.charAt(j)-'0';
				visited[i][j] = false;
			}
		}
		BFS(0,0);
		
		System.out.println(arr[n-1][m-1]);
	}
	
	
	
	public static void BFS(int x, int y)
	{
		
		
		visited[x][y] = true;
		
		LinkedList<Node> queue = new LinkedList<Node>();
		
		queue.add(new Node(x,y));
		
		while(queue.size() != 0)
		{
			Node s = queue.poll();
			
			for(int i=0; i<4; i++)
			{
				int nextX = s.x + dx[i];
				int nextY = s.y + dy[i];
				
				//지도를 넘어가면
				if(nextX < 0 || nextX >= n || nextY<0 || nextY >=m )
					continue;
				//방문한 곳이면
				if (visited[nextX][nextY] || arr[nextX][nextY]==0)
					continue;
				
				queue.add(new Node(nextX,nextY));
				visited[nextX][nextY] = true;
				arr[nextX][nextY] = arr[s.x][s.y] + 1;
			}
			
		}
	}
}
class Node {
	int x;
	int y;
	
	Node (int a, int b)
	{
		this.x = a;
		this.y = b;
	}
}
