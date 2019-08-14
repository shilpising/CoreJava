package javaBestPractice;

import java.util.LinkedList;

//stack using linkedlist

class StackUsingLinkedList{
	static LinkedList<Integer> list=new LinkedList<>();
	
	public static void push(int i){
		if(list.isEmpty()){
			list.add(i);
		}
		else{
			list.addFirst(i);
		}
	}
	
	public static int pop(){
		if(!list.isEmpty()){
			return list.removeFirst();
		}
		return -1;
	}
	
	public static int peep(){
		if(!list.isEmpty()){
			return list.getFirst();
		}
		return -1;
	}
	public static void main(String args[]){
		push(10);
		push(1);
		push(15);
		push(20);
		push(30);
		push(90);
		System.out.println(list);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(list);
		System.out.println(peep());
	}
}