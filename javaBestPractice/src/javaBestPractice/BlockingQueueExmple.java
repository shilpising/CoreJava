package javaBestPractice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
//producer class

class ProducerQueue implements Runnable{
	private final BlockingQueue<Integer> queue;
	
	ProducerQueue(BlockingQueue<Integer> q){
		queue=q;
	}
	
	public void run() {
		try {
				for(int i=0;i<10;i++) {
					System.out.println("Produced--"+i);
					queue.put(i);
				}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class ConsumerQueue implements Runnable{
	private final BlockingQueue<Integer> queue;
	
	ConsumerQueue(BlockingQueue<Integer> q){
		queue=q;
	}
	
	public void run() {
		try {
				while(true) {
					System.out.println("Consumed--"+queue.take());
					
				}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class BlockingQueueExmple {

	public static void main(String[] args) {
		//CreatingSharedObject
		BlockingQueue<Integer> sharedQueue=new LinkedBlockingQueue<Integer>();
		 //Creating Producer and Consumer Thread
	     Thread prodThread = new Thread(new ProducerQueue(sharedQueue));
	     Thread consThread = new Thread(new ConsumerQueue(sharedQueue));

	     //Starting producer and Consumer thread
	     prodThread.start();
	     consThread.start();
	}

}
