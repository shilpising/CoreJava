package javaBestPractice;

public class ThreadJoinExample implements Runnable {
	
	public void run() {
		try {
				Thread.sleep(1000);
				System.out.println("Thread ---"+Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadJoinExample test =new ThreadJoinExample();
		Thread[] t=new Thread[10];
		try {
			for(int i=0;i<10;i++) {
				t[i]=new Thread(test,"thread"+i);
				t[i].start();
				t[i].join();//If join() is called on a Thread instance, 
				//the currently running thread will block until the Thread instance has finished executing.
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
