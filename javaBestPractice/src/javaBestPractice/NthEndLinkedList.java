package javaBestPractice;

public class NthEndLinkedList {

Node head;
	
	public NthEndLinkedList(int n) {
		head=new Node(n);
	}
	public NthEndLinkedList() {
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
	
	private void getNthEndElement(Node head2, int count) {
		Node temp=head2, pthNode=null;
		for(int i=1;i<count;i++) {
			if(temp!=null) {
				temp=temp.next;
			}
		}
		while(temp!=null) {
			if(pthNode==null) {
				pthNode=head;
			}
			else {
				pthNode=pthNode.next;
			}
			temp=temp.next;
		}
		if(pthNode!=null) {
			System.out.println(pthNode.num);
		}
	}
	
	private void printListFromEnd(Node head) {
		if(head==null) {
			return ;
		}
		printListFromEnd(head.getNext());
		System.out.println(head.getNum());
	}

	public static void main(String[] args) {
	/*	NthEndLinkedList list=new NthEndLinkedList();
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.getList();
		list.getNthEndElement(list.head,5);
		list.printListFromEnd(list.head);*/
		//list.remove(10);
		//list.getList();
		/*int[] ar= {1,5,6,9};
		 int sum=0;
	        for(int i : ar.length){//Can only iterate over an array or an instance of java.lang.Iterable
	            sum+=i;
	        }*/
	/*	List<Integer> a=new ArrayList<>(); List<Integer> b=new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		b.add(3);
		b.add(6);
		b.add(10);
		 List<Integer> result=new ArrayList<>();
		 result.add(0,0); result.add(1,0);
	        for(int i=0;i<a.size() && i<b.size();i++){
	        	if(a.get(i)>b.get(i)){
	                result.set(0,result.get(0)+1);
	            }
	            else if(a.get(i)<b.get(i)){
	                result.set(1,result.get(1)+1);
	            }
	        }
	        System.out.println(result);*/
		
		int[][] arr= {{11, 2, 4},{4, 5, 6},{10, 8, -12}};
		int left=0,right=0;
		for(int i=0;i<arr.length;i++) {
			left+=arr[i][i];
			right+=arr[i][(arr.length -1)-i];
		}
		for(int i=0;i<arr.length;i++) {
			right+=arr[i][(arr.length -1)-i];
		}
		 System.out.println(left+" "+right);
		 System.out.println(Math.abs(left-right));
		/*
		 int swaps=0;
		 int[] arr= {1,3, 5,2, 4, 6, 7};
	        for(int i=0;i<arr.length-1;++i){
	            for(int j=i+1;j<arr.length-1;j++){
	                int temp=0;
	                if(arr[i]>arr[j]){
	                    temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                    ++swaps;
	                }
	            }
	        }
	        System.out.println(swaps);*/
	}
	
}
