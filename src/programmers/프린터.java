package programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class 프린터 {
	class Node {
		int index;
		int priority;
		
		public Node(int p, int i)
		{
			index = i;
			priority = p;
		}
	}
	public static void main(String[] args) {
		
		
		int priorities[] = {1,1,9,1,1,1};
		int location = 0;
		
		int count = 0;
		
		LinkedList<Node> queue = new LinkedList<>();
		PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());


		for(int i = 0; i<priorities.length; i++)
		{
			prq.add(priorities[i]);
			queue.add(new Node(priorities[i],i));
		}
		
		while(!queue.isEmpty())
		{
			Node node = queue.pollFirst();
			
			if(node.priority == prq.peek())	// 우선순위가 제일 높은것
			{
				count++;
				if(node.index == location)
				{
					System.out.println(count);
					break;
				}
				else 
				{
					prq.poll();
				}
			}
			else	// 우선순위 높지 않음
			{
				queue.add(node);
			}
		}
		
		
		
	}
}

