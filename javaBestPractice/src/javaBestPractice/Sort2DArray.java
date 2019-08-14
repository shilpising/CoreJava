package javaBestPractice;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
	static Integer a[][]={{1234,46},{5443,564},{362,24},{6742,825},{347,549}};
			
	public static void main(String[] args) {
		
		System.out.println("ORiginal");
		displayArray();
		
		/*Arrays.sort(a, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
            	return o1[0].compareTo(o2[0]);

            }
        });
		System.out.println("Sorting whole array");
		displayArray();*/
		
		Arrays.sort(a, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
            	return o1[0].compareTo(o2[0]);

            }
        });
		System.out.println("Sorting on 1st column");
		displayArray();
		
		Arrays.sort(a, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
            	return o1[1].compareTo(o2[1]);

            }
        });
		
		System.out.println("Sorting on 2nd column");
		displayArray();

	}
	private static void displayArray() {
		System.out.println("-------------------------------------");
		//System.out.println("Item id\t\tQuantity");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t\t" );
			}
		System.out.println();
		}
		System.out.println("-------------------------------------");
	}
}
