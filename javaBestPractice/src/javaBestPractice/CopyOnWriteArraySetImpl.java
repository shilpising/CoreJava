package javaBestPractice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetImpl {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> arrList=new CopyOnWriteArraySet<String>();
		arrList.add("atharva");
		arrList.add("shilpi");
		arrList.add("avi");
		arrList.add("vishu");
		
		Iterator<String> itr=arrList.iterator();
		while(itr.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n", itr.next());
            arrList.remove("vishu"); 
            //itr.remove();//not supported in CopyOnWriteArrayList in Java
		}
		System.out.println("====================\n");
		Iterator<String> itr1=arrList.iterator();
		while(itr1.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n", itr1.next());
           
		}
	}

}
