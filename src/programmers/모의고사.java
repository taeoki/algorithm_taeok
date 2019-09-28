package programmers;

public class 모의고사 {
	public static void main(String[] args) {
		int answers[] = new int[6];
		int[] p1 = {1,2,3,4,5};   // length 5
        int[] p2 = {2,1,2,3,2,4,2,5}; // length 8
        int[] p3 = {3,3,1,1,2,2,4,4,5,5}; // length 10
        
        int result[] = new int[3];
        result[0] = 0;
        result[1] =0;
        result[2] = 0;
        
        for(int a=0; a<answers.length; a++)
        {
        	//첫번째
        	if(answers[a] == p1[a%p1.length])
        		result[0]++;
        		
        	//두번째
        	if(answers[a] == p2[a%p2.length])
        		result[1]++;	
        		
        	//세번째
        	if(answers[a] == p3[a%p3.length])
        		result[2]++;
        }
	}
}

class person{
	int collectCount;
	int answer[];
	int number;
	
	public person(int num, int answer[], int )
	{
		
	}
}
