package backjun;
import java.util.*;
public class m1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	//	t-	테스트 케이스의 갯수
		
		
		for(int c=0; c<t; c++)
		{
		
		int m = sc.nextInt();	//	m-	배추밭 가로 길이	// 1<=m<=50
		int n = sc.nextInt();	//	n-	배추밭 세로 길이 
		
		int baechu[][] = new int[50][50];
		boolean visited[][] = new boolean[50][50];
		
		int k = sc.nextInt();	// k-	배추심어진위치의 갯수
		
		int bug = 0;
		
		for(int a=0; a<k; a++)
		{
			// [x][y]
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			baechu[x][y] = 1;
		}
		LinkedList<BNode> queue = new LinkedList<BNode>();
		
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				//[a][b]
				
				if(baechu[a][b] == 1 && visited[a][b] == false)
				{
					bug ++;
					queue.add(new BNode(a,b));
					
					while(!queue.isEmpty())
					{
						BNode s = queue.poll();
						
						int left = s.x - 1;
						int right = s.x + 1;
						int up = s.y + 1;
						int down = s.y - 1;
						
						if(left >= 0 && baechu[left][s.y] == 1 && visited[left][s.y] == false)
						{
							queue.add(new BNode(left,s.y));
							visited[left][s.y] = true;
						}
						if(right < m && baechu[right][s.y] == 1 && visited[right][s.y] == false)
						{
							queue.add(new BNode(right, s.y));
							visited[right][s.y] = true;
						}
						if(down >= 0 && baechu[s.x][down] == 1 && visited[s.x][down] == false)
						{
							queue.add(new BNode(s.x, down));
							visited[s.x][down] = true;
						}
						if(up < n && baechu[s.x][up] == 1 && visited[s.x][up] == false)
						{
							queue.add(new BNode(s.x, up));
							visited[s.x][up] = true;
						}
					}
				}
			}
		}
		
		System.out.println(bug);
	}
	}
}

class BNode{
	int x;
	int y;
	
	public BNode(int a, int b){
		x = a;
		y = b;
	}
}
