package javaBestPractice;

import java.util.Scanner;

public class PrimitiveExample {

	public static void main(String[] args) {
		char i=5;
		int j=i;
		long k=j;
		double l=k;
		l=i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(i+j+k+l);
		
		Number n=1;
		System.out.println(n);
		j=(int)n;
		System.out.println("j"+j);
	//	l=(float)n; Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Float
		//l=(double)n;Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double
		l=n.doubleValue();
		System.out.println(l);
		
		//boolean t=true;
		//j=(int)t; Cannot cast from boolean to int
		
		//boolean t=true;
		//j=(t==false); Type mismatch: cannot convert from boolean to int
		
		Boolean t=true;
		//i=(char)t.booleanValue();
		
		char ch='0';
		ch*=1.1;
		//char a=ch*5.5;
		//implicit conversion is done from char to double but not vice versa. 
		//char to int and vice versa. 
		//int to double but not vice versa.
		int num=1;
		//num=num *5.5;//cannot convert from double to int
		num*=5.5;
		System.out.println(ch);
		/*String input ="1 2 a 3 45 6";
		Scanner sc=new Scanner(input);
		int x=0;
		do {
			x=sc.nextInt();
			System.out.println(x+"");
		}while(x!=0);*/
	

		}
	}


