package javaBestPractice;

public class Qthree {
public static void main(String[] args) {
		
		int[] input_arr = new int[]{4, 3, 7, 8, 6, 2, 1, 5, 9};
		smallPyramid(input_arr);
		
		
	}
	
	public static void smallPyramid(int[] input_arr){
		
		boolean grt = true;
		
		for (int i = 0; i < input_arr.length-1; ++i) {
			
			if (grt) {
				
				if (input_arr[i] > input_arr[i+1]) {
					int temp = input_arr[i];
					input_arr[i] = input_arr[i+1];
					input_arr[i+1] = temp;
				}
				
			}else{
				
				if (input_arr[i] < input_arr[i+1]) {
					int temp = input_arr[i];
					input_arr[i] = input_arr[i+1];
					input_arr[i+1] = temp;
				}
			}
			
			grt = !grt;
		}
		System.out.print("arr[]={");
		for (int i = 0; i < input_arr.length; i++) {
			System.out.print(input_arr[i] + ",");
		}
		System.out.print("}");
	}
}
