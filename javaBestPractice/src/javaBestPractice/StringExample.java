package javaBestPractice;

//analyse the code and its o/p to get the count of new object created.
public class StringExample {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2="abc";
		
		String s4=new String("abc");
		String s3=s4;
		String s5=s1.substring(0,3);
		String s6="abc";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		System.out.println(s4==s1);
		System.out.println(s3==s4);
		System.out.println(s5);
		System.out.println(s4==s5);
		System.out.println(s2==s6);
	}

}
