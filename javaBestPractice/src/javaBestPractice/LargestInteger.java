package javaBestPractice;

import java.util.Arrays;


public class LargestInteger {

	public static void main(String[] args) {
		Integer[] arr= {10,2,4,77,8,1};
		Arrays.sort(arr);
		System.out.println("The sorted int array is:");
	      for (int number : arr) {
	         System.out.print(" " + number);
	      }
		System.out.println("\n third largest--"+arr[arr.length-3]);
	}

}
