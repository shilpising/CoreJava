package javaBestPractice;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue implements Runnable{
	private Semaphore sphore;
	
	private ReentrantLock lock;
	
	private boolean[] freePrinters;

	public PrintQueue() {
		super();
		this.sphore = new Semaphore(3);
		this.lock = new ReentrantLock();
		freePrinters=new boolean[3];
		for(int i=0;i<3;i++) {
			freePrinters[i] = true;
		}
	}
	public void printJob() {
			
		 try {
			 	sphore.acquire();
			
			//check the free printer
			 	int freePrinter=0;
			 	//lock.lock();
				 	for(int i=0;i<freePrinters.length;i++) {
				 		if(freePrinters[i]) {
				 			freePrinters[i]=false;
				 			freePrinter=i;
				 		}
				 	}
			//Allow other threads to check for free printer
			 	//lock.unlock();
			 	Long duration = (long) (Math.random() * 10000);
			 	System.out.println(Thread.currentThread().getName()
	                    + ": Printer " + freePrinter
	                    + " : Printing a Job during " + (duration / 1000)
	                    + " seconds :: Time - " + new Date());
	            Thread.sleep(duration);
	           
	            
	          //Printing is done; Free the printer to be used by other threads.
	           // lock.lock();
	            freePrinters[freePrinter]=true; //Mark the printer free
	            //lock.unlock();
	  } catch (InterruptedException e) {
			e.printStackTrace();
		}
		 finally
	     {  
			 System.out.printf("%s: The document has been printed\n", Thread
	                    .currentThread().getName());
			 sphore.release();
	     }
	}

	public void run() {
		 System.out.printf("%s: Going to print a document\n", Thread
	             .currentThread().getName());
	    printJob();
	}

}
