package javaBestPractice;

public class SwapInteger {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.print(a + "  "+ b);
		System.out.println("");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a + "  "+ b);
	}

}
