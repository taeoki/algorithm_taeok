package backjun;

import java.util.*;


public class m7576 {
	/*
	 * 첫 줄에는 상자의 크기를 나타내는 두 정수 M,N이 주어진다. 
	 * M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수를 나타낸다.
	 * 단, 2 ≤ M,N ≤ 1,000 이다. 둘째 줄부터는 하나의 상자에 저장된 토마토들의 정보가 주어진다. 
	 * 즉, 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보가 주어진다. 
	 * 하나의 줄에는 상자 가로줄에 들어있는 토마토의 상태가 M개의 정수로 주어진다. 
	 * 정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다. 
	 */
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) {
		/*
		 * 고려해야할 케이스
		 * - 토마토가 아예 없을 때, 
		 * - 토마토가 막혀 있을 때, ( 더이상 익을 토마토가 없을 때 )
		 * - 모든 토마토가 익었는지 확인
		 */
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int box[][] = new int[1000][1000];
		boolean visited[][] = new boolean[1000][1000];

		// start[0] = x좌표
		// start[1] = y좌표
		// 입력을 받으며 처음에 1인 지점이 있을 때, 
		// 1인 지점의 좌표값을 start 배열에 넣어줌.
		// start를 사용함으로, 토마토가 아예없을 때를 판단할 수 있음.
		LinkedList queue = new LinkedList();
		LinkedList<toNode> list = new LinkedList<toNode>();
		
		for(int a=0; a<n; a++)
		{
			for(int b=0; b<m; b++)
			{
				int tomato = sc.nextInt();
				box[a][b] = tomato;
				if(tomato == 1)
				{
					list.add(new toNode(b,a));
				}
			}
		}

		
		while( !list.isEmpty() )
		{
			toNode s = list.poll();
			visited[s.y][s.x] = true;
			
			int left = s.x-1;
			int right = s.x+1;
			int up = s.y+1;
			int down = s.y-1;
			
			if(left >= 0 && box[s.y][left] == 0 && visited[s.y][left] == false)	
			{
				list.add(new toNode(left,s.y));
				box[s.y][left] = box[s.y][s.x] + 1;
			}
			if(right < m && box[s.y][right] == 0 && visited[s.y][right] == false)
			{
				list.add(new toNode(right,s.y));
				box[s.y][right] = box[s.y][s.x] + 1;
			}
			if(up < n && box[up][s.x] == 0 && visited[up][s.x] == false)
			{
				list.add(new toNode(s.x,up));
				box[up][s.x] = box[s.y][s.x] + 1;
			}
			if(down >= 0 && box[down][s.x] == 0 && visited[down][s.x] == false)
			{
				list.add(new toNode(s.x, down));
				box[down][s.x] = box[s.y][s.x] + 1;
			}		
			
		}
		
		// 저장될 때 부터 모든 토마토가 익어있는 상태 -> day = 0 이며, 배열에 0이 없을 때
		// 토마토가 모두 익지 못하는 상황 -> day != 0 && 배열에 0이 남아있는 상황
		// 그렇지 않을 때, 시간초 출력 
		
		  int max = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (box[i][j] == 0) {
	                    //토마토가 모두 익지 못한 상황이라면  - 1
	                    System.out.println(-1);
	                    return;
	                }
	                max = Math.max(max, box[i][j]);
	            }
	        }
	        System.out.println(max - 1);
		
	}
}
class toNode{
	int x;
	int y;
	
	toNode(int a, int b)
	{
		x = a;
		y = b;
	}
}
