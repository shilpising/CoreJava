package javaBestPractice;

public class SingletonRaceCondition extends Thread{

	private static volatile SingletonRaceCondition obj=null;
	
	public static SingletonRaceCondition getInstance() {
		if(obj==null) {
			synchronized(SingletonRaceCondition.class) {
				if(obj==null) {
					obj=new SingletonRaceCondition();
				}
			}
		}
	return obj;
	}
	
	public void run() {
		System.out.println("inside--"+Thread.currentThread().getName());
		System.out.println(obj.hashCode());
		System.out.println(SingletonRaceCondition.getInstance().hashCode());
		System.out.println("leaving --"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SingletonRaceCondition obj=SingletonRaceCondition.getInstance(); 
		SingletonRaceCondition obj1=SingletonRaceCondition.getInstance(); 
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		Thread[] t=new Thread[10];
		for(int i=0;i<10;i++) {
			t[i]=new Thread(SingletonRaceCondition.getInstance(), "Thread"+i);
			t[i].start();
		}
	}
}
