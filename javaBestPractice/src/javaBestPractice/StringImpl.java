package javaBestPractice;

public class StringImpl {

	public static void main(String[] args) {
		String str=new String("test");
		String str1="test";
		String str2="test";
		if(str==str1) {
			System.out.println("equal");
		}
		if(str2==str1) {
			System.out.println("equal 2");
		}
		if(str.equals(str1)) {
			System.out.println("equal value");
		}
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
	}

}
