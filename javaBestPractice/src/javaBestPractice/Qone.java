package javaBestPractice;

import java.util.Arrays;

public class Qone {

	public static void main(String[] args) {
		int[] arr  = new int[]{1, 2, 3, -4, -1, 4};
		Arrays.sort(arr);
		for(int i=1;i<arr.length-1;i++){
			int temp=0;
			if(arr[i]<0){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					++i;
			}
		}
		System.out.print("arr[]={");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
	}

}
