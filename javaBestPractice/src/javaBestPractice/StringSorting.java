package javaBestPractice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSorting {

	public static void main(String[] args) {
		String str="ghjavnzxd";
		System.out.println("Original String : "+str);
		
		//Arrays.sort
		char[] charStr=str.toCharArray();
		Arrays.sort(charStr);
		System.out.println("Sorted String:  "+ String.valueOf(charStr));
		
		//Using Stream
		str="qwertybca";
		System.out.println("Original String : "+str);
		System.out.println("Sorted String  : " +Stream.of(str.split("")).sorted().collect(Collectors.joining()));
	}

}
