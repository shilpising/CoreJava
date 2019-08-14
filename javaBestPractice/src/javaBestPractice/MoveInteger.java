package javaBestPractice;

public class MoveInteger {

	public static void main(String[] args) {
		int[] arr= {16,17,3,4,5,2};
		int[] finalarr= {16,17,3,4,5,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]>arr[j]){
					arr[j]=arr[j+1];
					
				}
			}
		}
		/*System.out.println(arr.length);
		for(int num:arr) {
			System.out.print(", "+num);
		}*/
		for(int k=0,l=1;k<arr.length-1;k++,l++) {
			finalarr[k]=arr[l];
			//System.out.println(finalarr[k]+","+arr[l]);
		}
		//System.out.println();
		finalarr[arr.length-1]=-1;
		for(int num:finalarr) {
			System.out.print(", "+num);
		}
	}

}
