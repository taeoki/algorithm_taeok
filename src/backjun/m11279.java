package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class m11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String strTemp = sc.readLine();
		
		int commandCount = Integer.parseInt(strTemp);
		
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>(Collections.reverseOrder());

		
		for(int i=0; i< commandCount; i++)
		{
			strTemp = sc.readLine();
			
			if(strTemp.compareTo("0") == 0)
			{
				if(prq.size() == 0)
					System.out.println(0);
				else
				{
					System.out.println(prq.poll());
					//int max = Collections.max(s);
					//System.out.println(max);
					//s.remove(s.indexOf(max));
				}
				
			}
			else 
				prq.add(Integer.parseInt(strTemp));
		}
	}

}
