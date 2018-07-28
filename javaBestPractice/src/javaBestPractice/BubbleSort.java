package javaBestPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer array[]=new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		// Verify sorted array
        System.out.println(Arrays.toString(array));
		// Let's sort using bubble sort
      bubbleSort(array, 0, array.length);
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
	}

	private static void bubbleSort(Integer[] array, int fromIndex, int toIndex) {
		
		for(int i=toIndex-1;i>fromIndex;i--) {
			boolean isSorted = true;
			Integer temp;
			for(int j=fromIndex;j<i;j++) {
				if(array[j]>array[j+1]) {
					isSorted =false;
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			//If no swapping then array is already sorted
            if (isSorted)
                break;
		}
		//return array;
	}

}
