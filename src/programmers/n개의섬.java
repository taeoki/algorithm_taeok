package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class n개의섬 {
	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		
		Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2)
			{
				return o1[2] - o2[2];
			}
		});
		
		for (int i=0; i<costs.length; i++)
		{
			System.out.println("("+costs[i][0]+","+costs[i][1]+","+costs[i][2]+")");
		}
		
		
		int length = 0;
		boolean visited[] = new boolean[n];
		LinkedList<Integer> count = new LinkedList<>();
		System.out.println(costs.length);
		
		int a;
		for(a=0; a<costs.length; a++)
		{
			int start = costs[a][0];
			int end = costs[a][1];
			System.out.println(a+"("+start+","+end+")");
			if(visited[start] == false || visited[end] == false)
			{
				
				if(visited[start] == false )
					count.add(start);
				if(visited[end] == false)
					count.add(end);
				
				visited[start] = true;
				visited[end] = true;
				length += costs[a][2];
				
				if(count.size()==n)
				{
					System.out.println("gg");
					//break;
				}
				//i++;
			}
		
			System.out.println(length);
			break;
		}
		
		/*
		int k =0;
		while(k < 10)
		{
			k++;
			boolean visited[] = new boolean[n];
			LinkedList<Integer> count = new LinkedList<>();
			int length = 0;
			int start;
			int end;
			for(int c=0; c<costs.length; c++)
			{
				start = costs[c][0];
				end = costs[c][1];
				if(visited[start] == false || visited[end] == false)
				{
					System.out.println(c+"("+start+","+end+")");
					if(visited[start] == false )
						count.add(start);
					if(visited[end] == false)
						count.add(end);
					
					visited[start] = true;
					visited[end] = true;
					length += costs[c][2];
					
					if(count.size()==n)
					{
						System.out.println("gg");
						break;
					}
					//i++;
				}
			
				System.out.println(length);
				break;
			}
			
			
		}
		*/
		
	}

}
