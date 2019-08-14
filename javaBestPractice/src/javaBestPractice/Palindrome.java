package javaBestPractice;

public class Palindrome {

	public static void main(String[] args) {
		 System.out.println("integer 100 --"+checkIntegerPalindrome( 100 )); //false
	        System.out.println("integer 101 --"+checkIntegerPalindrome( 101 )); //true
	        System.out.println("integer 500045 --"+checkIntegerPalindrome( 500045 )); //false
	        System.out.println("integer 50005 --"+checkIntegerPalindrome( 50005 )); //true
	        
	        
	        System.out.println("String madam --"+checkStringPalindrome( "madam" )); //false
	        System.out.println("String 101 --"+checkStringPalindrome( "101" )); //true
	        System.out.println("String dalda --"+checkStringPalindrome( "dalda" )); //false
	        System.out.println("String 50005 --"+checkStringPalindrome( "50005" )); //true
	        System.out.println("String shilpi --"+checkStringPalindrome( "shilpi" )); //true
	}

	private static boolean checkIntegerPalindrome(int i) {
		int num=i;
		int rev=0;
		while(num>0) {
			int temp;
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(i==rev) {
			return true;
		}
		return false;
	}
	
	//palindrome String using Recursion
	
	private static boolean checkStringPalindrome(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return checkStringPalindrome(s.substring(1, s.length()-1));
		}
		
		return false;
	}

}
