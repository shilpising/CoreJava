package javaBestPractice;

public class LinkList {
	Node head;
	
	public LinkList(int n) {
		head=new Node(n);
	}
	public LinkList() {
		// TODO Auto-generated constructor stub
	}
	class Node{
		int num;
		Node next;
		public int getNum() {
			return num;
		}
		public Node getNext() {
			return next;
		}
		
		public Node(int num) {
			super();
			this.num = num;
			next=null;
		}
		
		/*public boolean hasNext() {
			if(this.getNext()!=null) {
				return true;
			}
			return false;
		}*/
		
	}
	
	public void getList() {
		Node node=this.head;
		while(node!=null) {
			System.out.println(node.getNum());
			node=node.getNext();;
			
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
	public static void main(String[] args) {
		LinkList list=new LinkList();
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.getList();
		list.remove(10);
		list.getList();
	}
	private void remove(int i) {
		Node temp=this.head, prev=null;
		while(temp!=null && temp.num!=i) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
	}

}
