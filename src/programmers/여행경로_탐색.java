package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class 여행경로_탐색 {
	static String last;
	static LinkedList<String> s = new LinkedList<>();
	static String tickets[][]= {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
	public static void main(String[] args) {
	
		Arrays.sort(tickets, new Comparator<String[]>() {
			@Override
			public int compare(final String[] entry1, final String[] entry2)
			{
				final String nation1 = entry1[1];
                final String nation2 = entry2[1];
                return nation1.compareTo(nation2);	// 오름차순정렬
			}
		});
		
		
		
		boolean visited[] = new boolean[tickets.length];
		
		dfs("ICN",visited,s);
		s.add(last);
		
		String [] answer = new String[s.size()];
		
		for(int i=0; i<s.size(); i++)
			answer[i] = s.poll();
		
		System.out.println(answer);
	}
	public static void dfs(String start, boolean visited[], LinkedList s)
	{
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i][0].contains(start) && visited[i] == false)
			{
				visited[i] = true;
				s.add(tickets[i][0]);
				last = tickets[i][1];
				dfs(tickets[i][1], visited,s);
				break;
			}
		}
	}
}


