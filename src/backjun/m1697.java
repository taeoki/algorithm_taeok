package backjun;

import java.util.*;

public class m1697 {
	/*
	 * �����̴� ������ ���ٲ����� �ϰ� �ִ�. 
	 * �����̴� ���� �� N(0 �� N �� 100,000)�� �ְ�, ������ �� K(0 �� K �� 100,000)�� �ִ�. 
	 * �����̴� �Ȱų� �����̵��� �� �� �ִ�. 
	 * ����, �������� ��ġ�� X�� �� �ȴ´ٸ� 1�� �Ŀ� X-1 �Ǵ� X+1�� �̵��ϰ� �ȴ�. 
	 * �����̵��� �ϴ� ��쿡�� 1�� �Ŀ� 2*X�� ��ġ�� �̵��ϰ� �ȴ�.
	 * �����̿� ������ ��ġ�� �־����� ��, 
	 * �����̰� ������ ã�� �� �ִ� ���� ���� �ð��� �� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	/*
	 *  (1����)
	 *  x-1
	 *	x+1
	 *	x*2 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int subin = sc.nextInt();
		int little = sc.nextInt();
		
		int array[] = new int[100001];	// ���� �� Ȯ���� ��,
		
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
