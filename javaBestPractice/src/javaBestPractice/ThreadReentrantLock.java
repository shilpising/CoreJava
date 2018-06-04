package javaBestPractice;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadReentrantLock extends Thread{
	public static final ReentrantLock lock=new ReentrantLock();
	private int i=0;
	
	private void show(String name) {
		lock.lock();
		try {
			i++;
			System.out.println("Count : "+ i + " - thread : " + name);
		}finally {
			lock.unlock();
		}
	}
	public void run() {
		while(i<6) {
			show(Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadReentrantLock obj= new ThreadReentrantLock();
		Thread t1=new Thread(obj,"T1");
		Thread t2=new Thread(obj,"T2");
		t1.start();
		t2.start();

	}

}
