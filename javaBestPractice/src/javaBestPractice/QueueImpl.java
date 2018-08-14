package javaBestPractice;

import java.util.LinkedList;

public class QueueImpl {

	int size=-1;
	LinkedList<String> list;
	
	
	public QueueImpl(int i) {
		size=i;
		list=new LinkedList<String>();
	}
	
	public void enQueue(String str) {
		if(list.size()==0) {
			list.addFirst(str);
		}else if(list.size()>0 && list.size()<size) {
			list.addLast(str);
		}
	}
	
	public String deQueue() {
		if(list.size()==0) {
			return "";
		}
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return (list.size()==0);
	}

	public static void main(String[] args) {
		QueueImpl queueObj=new QueueImpl(5);
		queueObj.enQueue("shilpi");
		queueObj.enQueue("is");
		queueObj.enQueue("a");
		queueObj.enQueue("good");
		queueObj.enQueue("girl");
		queueObj.enQueue("@@@");
		queueObj.enQueue("##");
		while(!queueObj.isEmpty()) {
			System.out.print(queueObj.deQueue());
			 System.out.print(" ");
		}
		
		

	}

}
