package javaBestPractice;

public class NthEndLinkedListSingleLoop {

	Node head;
	
	public NthEndLinkedListSingleLoop(int n) {
		super();
		this.head = new Node(n);
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
		}
	}
	
	public int NthEndLinkList(int n) {
		Node p1=head, p2=null;
		int counter=1;
		while(p1!=null) {
			if(counter<n) {
				counter++;
			}
			else {
				if(p2==null) {
					p2=head;
				}else {
					p2=p2.next;
				}
			}
			p1=p1.next;
			
		}
		if(p1==null && counter<n && p2==null) {
			return 0;
		}
		else if( p2!=null && n>0){
			return p2.getData();
		}
		return 0;
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
				return true;
			}
		}
		return false;
	}
	
	public void reverse() {
		Node current=head;
		Node prev=null, next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	
	public static void main(String[] args) {
		NthEndLinkedListSingleLoop list=new NthEndLinkedListSingleLoop(3);
			list.add(5);
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.getList();
			System.out.println();
			System.out.println(list.NthEndLinkList(-1));
			list.reverse();
			list.getList();
			
	}
}
