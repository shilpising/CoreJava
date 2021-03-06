package javaBestPractice;

import java.util.LinkedList;
import java.util.List;


class Message{
	List<String> msg=new LinkedList<String>();
	int limit=3;
	static int count=0;
	
	public synchronized void produce(String msg) {
		try {
				while(count==limit) {
					wait();
				}
				this.msg.add(msg+(++count));
				System.out.println("Producer has added " + this.msg.get(count-1));
				notifyAll();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void consume() {
		try {
			while(count==0) {
				wait();
			}
			System.out.println(msg.remove(--count));
			notifyAll();
			
		
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
class Producer implements Runnable{
	private Message obj;
	
	Producer(Message obj){
		this.obj=obj;
	}
	 public void run() {
		 System.out.println("inside producer run"+Thread.currentThread().getName());
		 obj.produce("A");
		 obj.produce("B");
		 obj.produce("C");
		 obj.produce("D");
		 try {
			 Thread.sleep(1000);
			 obj.produce("E");
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
}

class Consumer implements Runnable{
	private Message obj;
	Consumer(Message obj){
		this.obj=obj;
	}
	public void run() {
		 System.out.println("inside consumer run"+Thread.currentThread().getName());
		 obj.consume();
		 obj.consume();
		 obj.consume();
		 obj.consume();
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
	}

public class ProducerConsumer{
	
	
	public static void main(String[] args) {
		Message m=new Message();
		Producer p=new Producer(m);
		Consumer c=new Consumer(m);
		Thread t1=new Thread(p,"producer");
		Thread t2=new Thread(c,"consumer1");
		Thread t3=new Thread(c,"consumer2");
		t1.start();
		t2.start();
		t3.start();
		//t3.start(); java.lang.IllegalThreadStateException
		//t3.run(); //valid //this will call current thread run irrespective of any thread calling.
		
	}

}
