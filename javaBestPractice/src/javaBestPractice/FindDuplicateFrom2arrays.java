package javaBestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateFrom2arrays {

	public static void main(String[] args) {
		
		
		//Find duplicate characters from 2 strings without using 2 loops
		String str1="asdfg";
		String str2="axcgg";
		StringBuilder fstr=new StringBuilder(str2.toLowerCase());
		StringBuilder finals=new StringBuilder();
		char[] temp=str1.toLowerCase().toCharArray();
		for(char c: temp){
			if(str2.indexOf(c)>=0){
				 finals.append(c);
				}
		}
		System.out.println(finals);

		
		//Find duplicate integer from 2 integer array without using 2 loops
		int[] arr1={1,32,6,4,7,0};
		int[] arr2={1,3,0,32,5};
		Arrays.sort(arr1);//{0,1,4,6,7,32}
		
		Arrays.sort(arr2);//{0,1,3,5,32}
		List<Integer> list=new ArrayList<>();
		for(int i=0, j=0;i<arr1.length && j<arr2.length;){
			if(arr1[i]==arr2[j]){
				list.add(arr1[i]);
				i++;
				j++;
				
			}
			else if(arr1[i]> arr2[j]){
				j++;
			}
			else if(arr1[i]< arr2[j]){
				i++;
			}
	}
		System.out.println("Duplicate elements"+ list);


	}

	
}
