package javaBestPractice;


public class CircularLinkedList {
	Node head;
	Node last;
	public CircularLinkedList(int n) {
		super();
		this.head = new Node(n);
		last=this.head;
	}
	class Node{
		int data;
		Node next;
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		public Node getNext() {
			return next;
		}
		

		Node(int n){
			this.data=n;
			next=null;
		}
	}
	
	public void add(int n) {
		if(head!=null) {
			Node temp=head;
			head=new Node(n);
			head.next=temp;
		}
		else {
			head=new Node(n);
			last=this.head;
		}
	}
	
	public void addLast(int n) {
		if(last!=null) {
			Node l=last;
			Node temp=new Node(n);
			l.next=temp;
			last=temp;
			last.next=head.next;
		}
		else {
			head=new Node(n);
			last=this.head;
		}
	}
	
	public void getList() {
		Node node=this.head;
		while(node!=null) {
			System.out.print("\t"+node.getData());
			node=node.getNext();;
			
		}
	}
	
	public boolean cyclic() {
		Node fast, slow;
		fast=head;
		slow=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) {
				System.out.println(fast.getData());
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		CircularLinkedList list=new CircularLinkedList(3);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.getList();
		list.addLast(50);
		//list.getList();
		System.out.println();
		System.out.println(list.cyclic());
	}

}
