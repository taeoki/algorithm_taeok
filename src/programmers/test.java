package programmers;

import java.util.LinkedList;

public class test {
	public static void main(String[] args) {

		boolean [] visited = new boolean[3];
		visited[0] = true;
		
		boolean [] cp = visited.clone();
		System.out.println(cp[0]);
		cp[0] = false; 
		System.out.println(cp[0]);
		System.out.println(visited[0]);
	}
}
