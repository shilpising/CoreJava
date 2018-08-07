package javaBestPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskOne implements Runnable{
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class TaskTwo implements Runnable{
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DemoExecutorUsage {

	public static ExecutorService executor;
	public static volatile Future taskOne=null;
	public static volatile Future taskTwo=null;
	public static void main(String[] args) {
		executor=Executors.newFixedThreadPool(2);
		while(true) {
			 try
	            {
	                checkTasks();
	                Thread.sleep(1000);
	            } catch (Exception e) {
	                System.err.println("Caught exception: " + e.getMessage());
	            }
	        }
		}
	private static void checkTasks() throws Exception{
		if(taskOne==null|| taskOne.isCancelled()||taskOne.isDone()) {
			executor.submit(new TaskOne());
		
		}
		if(taskTwo==null|| taskTwo.isCancelled()||taskTwo.isDone()) {
			executor.submit(new TaskTwo());
		
		}
	}

}
