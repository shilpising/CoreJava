package javaBestPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task implements Runnable{
	int taskId=0;
	Task(int i){
		taskId=i;
	}
	
	public void run() {
		System.out.println("TaskId: "+taskId+"  performed by "+Thread.currentThread().getName());
	}
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		//Thread[] threads=new Thread[10]; Instead of this use the below
		ExecutorService threadPool=Executors.newFixedThreadPool(10);
		for(int i=1;i<=10;i++) {
			threadPool.submit(new Task(i));
			threadPool.execute(new Task(i));
		}
		

	}

}
