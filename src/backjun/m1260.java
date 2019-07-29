package backjun;

import java.util.*;
import java.util.Collections;

public class m1260 {
	/*
	 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
	 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
	 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
	
	 * 입력
	 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 
	 * 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 
	 * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
	 * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 
	 * 입력으로 주어지는 간선은 양방향이다.

	 * 출력
	 * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. 
	 * V부터 방문된 점을 순서대로 출력하면 된다.
	 */
	public static void main(String args[]) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		//점의 갯수
		int n = sc.nextInt();
		//간선의 갯수
		int m = sc.nextInt();
		//시작점의 번호
		int v = sc.nextInt();
		
		LinkedList<Integer> q[] = new LinkedList[n+1];
		for(int a = 1; a <n+1; a++)	// 정점의 갯수만큼 반복 
			q[a] = new LinkedList<Integer>();
		
		for(int a = 0; a < m; a++ )	// 간선의 갯수만큼 반복 
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			q[start].add(end);
			q[end].add(start);
		}
		
		for(int a = 1; a <n+1; a++)	// 정점의 갯수만큼 반복 
			Collections.sort(q[a]);	// 오름차순으로 정렬
		//	Collections.sort(q[a], Comparator.reverseOrder() );
		
		// dfs
		
		
		//System.out.println("q의 길이: "+q.length);
		//System.out.println("q[1]의 길이: "+q[1]);
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[n+1];
		
		queue.add(v);
		
		
		while(queue.size() != 0)
		{
			int startNum = queue.poll();
			visited[startNum] = true;
			System.out.println(startNum);
			Iterator<Integer> i = q[startNum].listIterator();
			
			while(i.hasNext())
			{
				int num = i.next();
				
				if ( visited[num] != true)
				{
					queue.add(num);
					visited[num] = true;
				}
			}
		}
		
		
		
		
		
		
	}
	
}

class node {
	int nodeNumber;
	int adjCount;
	
	node(int start)
	{
		
	}
	
}
