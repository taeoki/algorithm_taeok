package programmers;

import java.util.*;
public class 구명보트 {
	public static void main(String[] args) {
		int[] people = {40,70,10,80,30,60,20,20,5};
		int limit = 100;
		
		PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int man : people)
			prq.add(man);
		
		int weight = 0;
		while(!prq.isEmpty()) {
			while(weight < limit && !prq.isEmpty())
			{
				int peo = prq.poll();
				weight += peo;
			}
		}
		String s = "123";
		Arrays.sort(people,Collections.sort(list););
	}
}
