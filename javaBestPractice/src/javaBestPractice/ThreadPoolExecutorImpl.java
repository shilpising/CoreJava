package javaBestPractice;

import java.util.concurrent.LinkedBlockingQueue;

class ThreadPool {
    private final int nThreads;
    private final PoolWorker[] threads;
    private final LinkedBlockingQueue queue;
 
    public ThreadPool(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedBlockingQueue();
        threads = new PoolWorker[nThreads];
 
        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }
 
    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task);
            queue.notify();
        }
    }
 
    private class PoolWorker extends Thread {
        public void run() {
            Runnable task;
            System.out.println("Inside PoolWorker run");
            while (true) {
                synchronized (queue) {
                	 System.out.println("Inside while run");
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = (Runnable) queue.poll();
                }
 
                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                    task.run();
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                }
            }
        }
    }
}

class TaskImpl implements Runnable {
	 
    private int num;
 
    public TaskImpl(int n) {
        num = n;
    }
 
    public void run() {
        System.out.println("Task " + num + " is running.");
    }
}
public class ThreadPoolExecutorImpl {

	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(7);
		 
        for (int i = 0; i < 5; i++) {
        	TaskImpl task = new TaskImpl(i);
            pool.execute(task);
        }

	}

}
