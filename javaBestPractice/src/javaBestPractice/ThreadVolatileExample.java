package javaBestPractice;

class ThreadVolatile extends Thread {
	volatile int  testvalue;
	public ThreadVolatile(String name) {
		super(name);
	}
	 public void run() {
		 System.out.println("\nInside Run method");
		 try {
			 for(int i=0; i<3;i++) {
					if(getName().equals("Thread1")) {
						 testvalue=10;
						 System.out.println("\nThread1");
					 }
					 if(getName().equals("Thread2")) {
						 System.out.println("Test value--"+testvalue);
					 }
					 Thread.sleep(1000);
			 }
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
}
public class ThreadVolatileExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadVolatile obj=new ThreadVolatile("Thread1");
		obj.start();
		
		new ThreadVolatile("Thread2").sleep(1000);
		new ThreadVolatile("Thread2").start();

	}

}