package javaBestPractice;

public class DuplicateChar {

	public static void main(String[] args) {
		String dup="Javaj";//Combination";//"Programming";
		char[] arr=dup.toLowerCase().toCharArray();
		for(int i=0;i<dup.length();i++) {
			duplicate(arr,i,dup.length());
		}

	}
	private static void duplicate(char[] arr, int low, int len) {
		if(arr[low]==arr[len-1] && (low<len-1)) {
			System.out.println(arr[low]);
		}else if(low<len-1) {
			duplicate(arr,low,len-1);
		}
	}

}
