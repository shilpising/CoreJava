package javaBestPractice;

import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[]={1,2};
			int[][] d={{1,2}};
			System.out.println("TESTs"+d[1][1]);
			int b=0;
		int c=a[0]/b;///The operator / is undefined for the argument type(s) int[], int
		//	System.out.println(c);
		}finally {
			
		}
		
	}

}
