package javaBestPractice;

public class ThreadDemo {
	
	public synchronized void  show(){
		System.out.println("Inside show");
	}
	public synchronized void  display(){
		System.out.println("Inside display");
	}
	public void  output(){
		System.out.println("Inside output");
	}

	public static void main(String[] args) throws InterruptedException {
		final ThreadDemo t = new ThreadDemo();
        Thread t1 = new Thread() { 
        			public void run() { 
        				System.out.println("Thread ---"+Thread.currentThread().getName());
        				t.show();
        				try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        				 } };
        Thread t2 = new Thread() { public void run() {
        							t.output();
						        	try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("Thread ---"+Thread.currentThread().getName());
									t.display(); 
						        	} };

        t1.start();
        t2.start();
        System.out.println(t2.getState());

	}

}
