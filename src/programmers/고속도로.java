package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class 고속도로 {
	public static void main(String[] args) {
		int routes[][] = {{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}};
		
		Arrays.sort(routes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		
		LinkedList<Leng> list = new LinkedList<>();
		LinkedList<Leng> save = new LinkedList<>();
		
		for(int i=0; i<routes.length; i++)
			list.add(new Leng(routes[i][0], routes[i][1]));
		
		while(!list.isEmpty())
		{
			Leng tmp;
			if( list.size() == 1)
			{
				tmp = list.poll();
				save.add(tmp);
			}
			else
			{
				tmp = list.poll();
			
				
				Leng tmp2 = list.poll();
				
				if(tmp.end >= tmp2.start)	// 겹치면
				{
					tmp.start = tmp2.start;
					if(tmp2.end <= tmp.end )
					{
						tmp.end = tmp2.end;
					}
					list.addFirst(tmp);
				}
				else 				// 안겹치면
				{
					save.add(tmp);
					list.addFirst(tmp2);
				}
			}
		}
		System.out.println(save.size());
		
	}
}
class Leng{
	int start;
	int end;
	public Leng(int s, int e)
	{
		start = s;
		end = e;
	}
}
