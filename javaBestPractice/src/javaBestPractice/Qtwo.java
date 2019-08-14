package javaBestPractice;

public class Qtwo {
public static void main(String[] args) {
		
		int[] arr  = new int[]{1, 4, 9, 15, 23, 28, 40, 50, 55};
		int diff = 5;
		
		getDifference(diff, arr);
		
	}
	
	static void getDifference(int diff, int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j > 0; j--) {
				
				if(arr[j] - arr[i] == diff){
					System.out.println(arr[i] +" "+ arr[j]);
				}
			}
		}
	}
	
}


