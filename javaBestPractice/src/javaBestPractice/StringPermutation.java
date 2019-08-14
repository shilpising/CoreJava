package javaBestPractice;

public class StringPermutation {
	public static void main(String[] args) {
		  permutation("123");
		 }

		 private static void permutation(String string) {
		  printPermutation(string,"");
		 }

		 private static void printPermutation(String string, String permutation) {
		  if(string.length()==0){
		   System.out.println(permutation);
		   return;
		  }

		  for(int i=0;i<string.length();i++) {
			  char str1=string.charAt(i);
			  String rem=string.substring(0, i)+string.substring(i+1);
			  printPermutation(rem, permutation+str1);
		  }
		  
		  
		 }
}
