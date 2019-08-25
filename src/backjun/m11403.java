package backjun;

import java.util.*;
public class m11403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedList<Integer> queue[] = new LinkedList[n+1];
		
		for(int a=1; a<=n; a++)
		{
			for(int b=1; b<=n; b++)
			{
				int num = sc.nextInt();
				
				if(num == 1)
					queue[1].add(b);
				
			}
		}
		
		for(int a=1; a<=n; a++)
		{
			while(!queue[a].isEmpty())
			{
				System.out.print(queue[a].poll());
			}
			System.out.println();
		}
	}
}
