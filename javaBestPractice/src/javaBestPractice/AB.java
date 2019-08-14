package javaBestPractice;

class TB{
	static  synchronized void m1() {
		System.out.println("inside static");
	}
	synchronized void m2() {
		System.out.println("inside non static");
	}
	void m3() {
		System.out.println("inside not synchronized");
	}
}
public class AB {
	
	public static void M(String str) {
		str="def";
		System.out.println(str);
	}

	public static void main(String[] args) {
		/*TB o=new TB();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				System.out.println("inside main run()");
			}
		});
		t1.start();*/
		String str="abc";
				M(str);
		System.out.println(str);
	}

}
