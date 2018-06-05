package javaBestPractice;

public class DeadLockDemoThread extends Thread {
	String i;
	DeadLockDemo obj=DeadLockDemo.getDeadLockDemo();
	DeadLockDemoThread(String i){
		this.i=i;
	}
	public void run() {
		System.out.println("SS");
		try {
		System.out.println("\nIn Run");
		System.out.println(Thread.currentThread().getName());
		obj.method1();
		Thread.sleep(500);
		obj.method2();
		System.out.println(Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DeadLockDemoThread[] threads=new DeadLockDemoThread[7];
		//Thread[] threads = new Thread[7];
		// try{
		 for (int i = 0; i < threads.length; i++) {
		      threads[i] = new DeadLockDemoThread("Thread : "+i);

		      threads[i].start();
			}
		//}catch(Exception e){System.out.println(e);}
		 }

}
