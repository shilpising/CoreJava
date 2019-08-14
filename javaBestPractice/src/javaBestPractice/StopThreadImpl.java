package javaBestPractice;

import java.util.logging.Logger;

class IndexProcessor implements Runnable {

      private volatile boolean running = true;

    public void terminate() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            try {
                System.out.println("Sleeping...");
                Thread.sleep((long) 15000);

                System.out.println("Processing");
            } catch (InterruptedException e) {
            	System.out.println("Exception"+ e.getMessage());
                running = false;
            }
        }

    }
}


public class StopThreadImpl {
	
	public static void main(String[] args) throws InterruptedException {
		IndexProcessor runnable = new IndexProcessor();
		Thread thread = new Thread(runnable,"abc");
        System.out.println("Starting thread: " + thread.getName());
        thread.start();
        System.out.println("Background process successfully started.");
        Thread.sleep((long) 1500);
		System.out.println("Stopping thread: " + thread.getName());
	        if (thread != null) {
	            runnable.terminate();
	            thread.join();
	            System.out.println("Thread successfully stopped.");
	        }
	}

}
