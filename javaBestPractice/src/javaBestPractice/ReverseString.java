package javaBestPractice;

public class ReverseString {

	public static void main(String[] args) {
		//String reverse using recursion
		String str="Morning";
		String rev=reverse(str);
		System.out.println(rev);

		
		//String reverse without recursion
		System.out.println("Without recursion--- ");
		if(null!=str) {
			for(int i=str.length()-1;i>=0;--i){
					System.out.print(str.charAt(i));
			}
		}
	}
	
	private static String reverse(String str){
		if(null==str){
			return str;
		}
		if(null!=str&& str.length()<=1){
			return str;
		}
		char temp=str.charAt(str.length()-1);
		return temp+reverse(str.substring(0,str.length()-1));
}

	
}
