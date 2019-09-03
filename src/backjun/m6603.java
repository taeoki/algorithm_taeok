package backjun;

import java.util.*;
public class m6603 {
/*
 * 독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.
 * 로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.
 * 예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다. 
 * ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
 * 집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.
 * 
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있다. 첫 번째 수는 k (6 < k < 13)이고, 
 * 다음 k개 수는 집합 S에 포함되는 수이다. S의 원소는 오름차순으로 주어진다.
 * 입력의 마지막 줄에는 0이 하나 주어진다. 
 * 
 * 7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0
 */
	static int n;
	static int arr[];
	static int result[];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n];
		result = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		DFS(0,0);
		System.out.println();
		
		
	}
	 public static void DFS(int start, int depth){
	        if(depth==6){
	            print();
	        }
	        for(int i=start; i<n; i++){
	        result[i] = 1;
	        
	        //디버그용 프린트문 -------
	        System.out.print("dfs("+start+","+depth+"), i="+i+"  ");
	        print();
	        //--------------------
	        
	        DFS(i+1,depth+1);
	        result[i] = 0;
	        }
	        
	    }
	    public static void print(){
	        for(int i=0; i<n; i++){
	            if(result[i]==1)
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	    }
}
