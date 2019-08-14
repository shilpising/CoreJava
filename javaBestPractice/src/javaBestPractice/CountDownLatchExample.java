package javaBestPractice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CountDownLatchExample implements Runnable {

	CountDownLatch latch;
	
	public CountDownLatchExample(CountDownLatch latch) {
		super();
		this.latch = latch;
	}
	
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() +"  Waiting");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() +"  is Up");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}

	public static void main(String[] args) {
		//Creating CyclicBarrier with 3 parties
		CountDownLatch cb=new CountDownLatch(3);/*, new Runnable() {

			public void run() {
				System.out.println("All parties has arrived at barrier, lets play");
			}
	});*/
		Thread t1=new Thread(new CountDownLatchExample(cb),"T1");
		Thread t2=new Thread(new CountDownLatchExample(cb),"T2");
		Thread t3=new Thread(new CountDownLatchExample(cb),"T3");
		Thread t4=new Thread(new CountDownLatchExample(cb),"T4");
		Thread t5=new Thread(new CountDownLatchExample(cb),"T5");
		Thread t6=new Thread(new CountDownLatchExample(cb),"T6");
		t4.start();
		t1.start();
		t2.start();
		t3.start();
		t5.start();
		t6.start();
		try{
            cb.await();  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
       }catch(InterruptedException ie){
           ie.printStackTrace();
       }
		
	}
}
