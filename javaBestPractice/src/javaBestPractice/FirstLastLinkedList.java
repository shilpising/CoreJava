package javaBestPractice;

import java.util.LinkedList;


public class FirstLastLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		list.add(150);
		list.add(120);
		
		System.out.println("list---"+list);
		System.out.println("First element--"+list.getFirst());
		System.out.println("First element--"+list.getLast());
		
		//Adding element at first and last position of Linked List
		list.addFirst(5);
		list.addLast(15);
		
		System.out.println("list---"+list);
		System.out.println("First element--"+list.getFirst());
		System.out.println("First element--"+list.getLast());
	}

}
