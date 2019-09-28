package lib;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class 우선순위큐 {
	public static void main(String[] args) {
		String[] operations = 	{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		int min = 0;
		int max = 0;
		PriorityQueue<Integer> prq = new PriorityQueue<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=0; i<operations.length; i++)
		{
			String [] tmp = operations[i].split(" ");
			
			// insert
			if(tmp[0].contains("I"))	// insert
			{
				
				int num = Integer.parseInt(tmp[1]);
				prq.add(num);
				System.out.println("insert "+num);
			}
			else
			{
				if(!prq.isEmpty())
				{
					if(tmp[1].contains("-1"))	// 최솟값 삭제
					{
						System.out.print("del-1/");
						System.out.println(prq.peek());
						prq.poll();
					}
					else	// 최댓값 삭제
					{
						
						prq = del(prq);
					}
				}
			}	
			print(prq);
		}
		int answer[] = {0,0};
		if(prq.size()==0)
			System.out.println("0,0");
		else if(prq.size() == 1)
		{
			answer[0] = prq.peek();
			answer[0] = prq.peek();
		}
		else
		{
			answer[1] = prq.peek();
			for(int a=0; a<prq.size()-1; a++)
				prq.poll();
			answer[0] = prq.poll();
		}
		
		System.out.println(answer[0]+","+answer[1]);
		
	}
	
	public static PriorityQueue<Integer> del(PriorityQueue<Integer> q)
	{
		if(q.isEmpty())
		{
			return q;
		}
		else
		{
			int size = q.size();
			PriorityQueue<Integer> s = new PriorityQueue<>();
			for(int i=0; i<size-1; i++)
			{
				s.offer(q.poll());
			}
			System.out.println("del:"+q.poll());
			return s;
		}
		
	}
	public static void print(PriorityQueue<Integer> q)
	{
		PriorityQueue<Integer> s = q;
		System.out.println("print");
		while(!s.isEmpty())
		{
			System.out.print(s.poll()+" ");
		}
		System.out.println();
	}
}
