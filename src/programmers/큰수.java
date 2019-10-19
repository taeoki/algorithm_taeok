package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 큰수 {
	public static void main(String[] args) {
		int numbers[] = {3, 30, 34, 5, 9};
		
		
		String [] number = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			number[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(number, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		if(number[0] == "0")
			return "0";
		
		String result = "";
		
		for(String msg : number) {
			result += msg;
		}
		
		return result;
		
		
		
		/*
		for(int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length-i-1; j++) {
                String num1 = Integer.toString(numbers[j]);
                String num2 = Integer.toString(numbers[j+1]);
                int number1 = Integer.parseInt(num1+num2);
                int number2 = Integer.parseInt(num2+num1);
                
                if(number1 < number2) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
		String str = "";
        for(int i=0; i<numbers.length; i++) {
            str += Integer.toString(numbers[i]);
        }
        System.out.println(str);
        */
	}
}
