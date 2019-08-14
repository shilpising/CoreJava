package javaBestPractice;

public class LinkedListImpl {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int num){
			data=num;
			next=null;
		}
	}
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListImpl list=new LinkedListImpl();
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		list.head=first;
		first.next=second;
		second.next=third;
		list.printList();
	}

}
