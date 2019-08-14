package javaBestPractice;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		Integer array[]={4,3,1,2};// {12,13,24,10,3,6,90,70};
		int swaps=0;
		// Verify un sorted array
        System.out.println(Arrays.toString(array));
        sort(array,0,(array.length-1));
     // Verify sorted array
        System.out.println(Arrays.toString(array));
	}

	private static void sort(Integer[] array, int low, int high) {
		int middle=low+(high-low)/2;
		int pivot=array[middle];
		int i=low; 
		int j=high;
		int swaps=0;
		while(i<=j){
			
			while(array[i]<pivot) {
				i++;
			}
			while(array[j]>pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
				++swaps;
				}
		}
		if(low<j) {
			sort(array,low,j);
		}
		if(high>i) {
			sort(array,i,high);
		}
		System.out.println(swaps);
	}
	
}
