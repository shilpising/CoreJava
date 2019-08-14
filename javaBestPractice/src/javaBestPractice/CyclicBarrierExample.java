package javaBestPractice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample implements Runnable {

	CyclicBarrier barrier;
	
	public CyclicBarrierExample(CyclicBarrier barrier) {
		super();
		this.barrier = barrier;
	}
	
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() +"  Waiting on barrier");
			barrier.await();
			System.out.println(Thread.currentThread().getName() +"  has crossed the barrier");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		catch(BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//Creating CyclicBarrier with 3 parties
		CyclicBarrier cb=new CyclicBarrier(3, new Runnable() {//last thread that trips the barrier

			public void run() {
				System.out.println("All parties has arrived at barrier, lets play");
			}
	});
		Thread t1=new Thread(new CyclicBarrierExample(cb),"T1");
		Thread t2=new Thread(new CyclicBarrierExample(cb),"T2");
		Thread t3=new Thread(new CyclicBarrierExample(cb),"T3");
		//Thread t4=new Thread(new CyclicBarrierExample(cb),"T4");
		//t4.start();
		t1.start();
		t2.start();
		t3.start();
		System.out.println(cb.getParties());
		cb.reset();
		/*Thread t4=new Thread(new CyclicBarrierExample(cb),"T5");
		Thread t5=new Thread(new CyclicBarrierExample(cb),"T4");
		Thread t6=new Thread(new CyclicBarrierExample(cb),"T6");
		t4.start();
		t5.start();
		t6.start();*/
	
	}
}
