package javaBestPractice;

class ThreadLoad implements Runnable{
	public void run() {
		System.out.println("run 1"+Thread.currentThread().getName());
	}
	
	public void run(String a) {
		System.out.println("run 2");
		
	}
}

public class ThreadMethodOverloading {
	
	public static void main(String[] args) {
	Thread t=new Thread(new ThreadLoad(),"abc" /*{
		public void run() {
			System.out.println("run 3");
		}
	}*/);
	Thread t1=new Thread(new ThreadLoad(),"sss");
	t.start();
	t1.start();
	t.run();
	t1.run();
    //t.run("a");//The method run() in the type Thread is not applicable for the arguments (String)
	/*try {
		t.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	}
}
