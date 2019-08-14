package javaBestPractice;

interface AA{
	static int returnInt() {
		return 0;
	}
}

interface BB{
	static int returnInt() {
		return 0;
	}
}
public class StaticMethodInterface implements AA,BB{
	
	public static void main(String[] args) {
		StaticMethodInterface.show();
	}

	private static void show() {
		System.out.println(AA.returnInt());
		System.out.println(BB.returnInt());
		
	}
}
