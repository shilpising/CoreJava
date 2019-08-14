package javaBestPractice;

public class SemaphorePrintingJob {
	
	public static void main(String[] args) {
		
		PrintQueue queue=new PrintQueue();
		Thread[] t=new Thread[10];
		for(int i=0;i<10;i++) {
			t[i] = new Thread(queue, "Thread " + i);
		}
		for(int i=0;i<10;i++) {
			t[i].start();
		}
	}

}
