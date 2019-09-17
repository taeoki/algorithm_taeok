package kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class m15953 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String msg = in.readLine();
		
		int T = Integer.parseInt(msg);
		
		for(int i=0; i<T; i++)
		{
			String c[] = in.readLine().split(" ");
			
			int prize = first(Integer.parseInt(c[0])) + second(Integer.parseInt(c[1]));
			System.out.println(prize);
		}
	}
	
	
	public static int first(int cnt)
	{
		if(cnt == 1)
			return 5000000;
		else if(cnt >=2 && cnt <=3)	//2등
			return 3000000;	
		else if(cnt >=4 && cnt <=6)	//3등
			return 2000000;
		else if(cnt >=7 && cnt <=10)//4
			return 500000;
		else if(cnt >=11 && cnt <=15 )//5
			return 300000;
		else if(cnt >=16 && cnt <= 21)//6등
			return 100000;
		else 
			return 0;
	}
	
	public static int second(int cnt)
	{
		if(cnt == 1)
			return 5120000;
		else if(cnt >=2 && cnt <=3)	//2등
			return 2560000;	
		else if(cnt >=4 && cnt <=7)	//3등 4명
			return 1280000;
		else if(cnt >=8 && cnt <=15)//4등 8명
			return 640000;
		else if(cnt >=16 && cnt <=31 )//5등 16명
			return 320000;
		else 
			return 0;
	}
}
