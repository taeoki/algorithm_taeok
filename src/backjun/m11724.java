package backjun;
import java.util.*;
public class m11724 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점의 갯수 = n 
		int n = sc.nextInt();
		
		//간선의 갯수 = m 
		int m = sc.nextInt();
		
		LinkedList node[] = new LinkedList[n+1];
		
		for(int a=1; a<=n; a++)
		{
			node[a] = new LinkedList<Integer>();
		}
		
		for(int b=0; b<m; b++)
		{
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			node[from].add(to);
			node[to].add(from);
		}
		
		
	}
}
