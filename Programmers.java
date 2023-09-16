package exercise;

import java.util.Arrays;

public class Programmers {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		int [] array = {2,5,1,9,8};
		Arrays.sort(array);
	
		
		System.out.println(array);
		
	}

	private static void f1() {
        int answer = 0;
        
        for(int i=1; i<=1000 ; i++) 	{
			if(i%2 == 0) {
				answer += i;
			}
       System.out.println(answer);
	}
	}
}



