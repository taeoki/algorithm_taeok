package lib;

import java.util.Arrays;
import java.util.Comparator;

public class 배열정렬 {
	public static void main(String[] args) {
		final String[][] data = new String[][] {
            new String[] { "2009.07.25 20:24", "Message A" },
            new String[] { "2009.07.25 20:17", "Message G" },
            new String[] { "2009.07.25 20:25", "Message B" },
            new String[] { "2009.07.25 20:30", "Message D" },
            new String[] { "2009.07.25 20:01", "Message F" },
            new String[] { "2009.07.25 21:08", "Message E" },
            new String[] { "2009.07.25 19:54", "Message R" } };
            
            // 오름차순 정렬
            Arrays.sort(data, new Comparator<String[]>() {
            	@Override
            	public int compare(final String[] entry1, final String[] entry2) {
            		final String time1 = entry1[0];
            		final String time2 = entry2[0];
            		//return time1.compareTo(time2);	// 오름차순 정렬
            		//return time2.compareTo(time1);	// 내림차순 정렬
            	}
			});
            
            for (final String[] s : data) {
                System.out.println(s[0] + " " + s[1]);
            }
	}
}



/*
Arrays.sort(array, new Comparator<int[]>() { 
	@Override
	public int compare(int[] o1, int[] o2) {
		return o1[1] - o2[1];	// 오름차순
		return o2[1] - o1[1];	// 내림차순
		
}		

*/