package javaBestPractice;

public class ThreadDemo{
	public static void main(String[] args) 
    { 
		ThreadDemoWorker demo = new ThreadDemoWorker(); 
        Thread a1 = new Thread(demo,"Thread1"); 
        Thread a2 = new Thread(demo,"Thread2"); 
        a1.start(); 
        a2.start(); 
    } 
    
} 
class ThreadDemoWorker  implements Runnable{
	
	private static int staticcount = 1; 
	private static int count = 1; 
	public static  void doSomethingStatic() 
    { 
		synchronized(ThreadDemoWorker.class) {
		System.out.println("inside static"+Thread.currentThread());
        for (int i = 0; i < 2; i++) 
        	 System.out.println(staticcount++); 
		}
    } 
    public void doSomething() 
    { 
    	synchronized(this) {
    	System.out.println("inside non static"+Thread.currentThread());
        for (int i = 0; i < 2; i++) 
            System.out.println(count++); 
    	}
    } 
        
    public void run() 
    { 
        doSomething(); 
        doSomethingStatic();
    } 
}