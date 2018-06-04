package javaBestPractice;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[]={1,2};
			int b=0;
//			int c=a/b;/The operator / is undefined for the argument type(s) int[], int
		//	System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("TESTs");
	}

}
