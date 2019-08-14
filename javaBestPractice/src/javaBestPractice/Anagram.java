package javaBestPractice;

import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		//Anagram
		String str1="anagramm";
		String str2="marganaa";
		if(null!=str1&& null!=str2&&str1.length()==str2.length()){
		char[] arr1 =str1.toLowerCase().split("").toString().toCharArray();//.toCharArray();
		StringBuilder arr2 =new StringBuilder(str2.toLowerCase().split("").toString());
			for(char c : arr1){
				int index=arr2.indexOf(""+c);
				if(index>-1){
				arr2.deleteCharAt(index);
				}
			}
			if(arr2.toString().isEmpty()){
				System.out.println("Strings are anagram");
				}
		}
			
	}		

}
