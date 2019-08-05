package backjun;

import java.util.*;

public class m1697 {
	/*
	 * 수빈이는 동생과 숨바꼭질을 하고 있다. 
	 * 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 
	 * 수빈이는 걷거나 순간이동을 할 수 있다. 
	 * 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 
	 * 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
	 * 수빈이와 동생의 위치가 주어졌을 때, 
	 * 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
	 */
	
	/*
	 *  (1초후)
	 *  x-1
	 *	x+1
	 *	x*2 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int subin = sc.nextInt();
		int little = sc.nextInt();
		
		int array[] = new int[100001];	// 조건 잘 확인할 것,
		
		findBfs(subin,little,array);
		
		 
		
		
	}
	
	public static int findBfs(int startEdge , int findEdge , int visited[])
	{
		
		int count = 0;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(startEdge);
		visited[startEdge] = 0;
		
		
		
		while(!queue.isEmpty())
		{
			int pop = queue.pop();
			
			if(pop == findEdge)
			{
				System.out.println(visited[pop]);
				break;
			}
			
			if(pop-1 >= 0 && visited[pop-1] == 0)
			{
				queue.add(pop-1);
				visited[pop-1] = visited[pop] + 1;
			}
			if(pop+1 <=100000 && visited[pop+1] == 0)
			{
				queue.add(pop+1);
				visited[pop+1] = visited[pop] + 1 ; 
			}
			if(pop*2 <=100000 && visited[pop*2] == 0)
			{
				queue.add(pop*2);
				visited[pop*2] = visited[pop] + 1;
			}
			
			
			
		}
		return count;
		
	}

}
