package programmers;
import java.util.*;
public class 하드디스크 {
	public static void main(String[] args) {
		int[][] jobs= {{0, 3}, {1, 9}, {2, 6}};
		
		LinkedList<Job> data = new LinkedList<>();
		
		for(int i=0; i<jobs.length; i++) {
			data.add(new Job(jobs[i][0], jobs[i][1]));
		}
	}
	public static class Job implements Comparable<Job> {
		int require;
		int length;
		
		Job(int r,int l) {
			require = r;
			length = l;
		}
		
		@Override 
		public int compareTo(Job o1) {
			if (this.length < o1.length) return -1;
		}
	}
}
