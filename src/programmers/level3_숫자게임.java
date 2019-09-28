package programmers;

import java.util.*;

public class level3_숫자게임 {
	public static void main(String[] args) {
		int A[] = {2,2,2,2};
		int B[] = {1,1,1,1};
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		LinkedList<Integer> AA = new LinkedList<>();
		LinkedList<Integer> BB = new LinkedList<>();
		
		for(int i=A.length-1; i>=0; i--)
		{
			AA.add(A[i]);
			BB.add(B[i]);
		}
		
	
		
		while(!AA.isEmpty())
		{
			int index = AA.size();
			
			int a = AA.poll();
			int b = BB.peek();
			
			if(a >= b)
			{
				BB.pollLast();
			}
			else
			{
				BB.poll();
				answer++;
			}	
		}
		
		System.out.println(answer);
		
	}
}
