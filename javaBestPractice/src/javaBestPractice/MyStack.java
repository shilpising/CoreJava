package javaBestPractice;

public class MyStack {

	private int stackSize;
	private int top;
	private long[] stackArray;
	public MyStack(int i) {
		stackSize=i;
		stackArray=new long[stackSize];
		top=-1;
	}

	public void push(long num) {
		if(!isFull()) {
			stackArray[++top]=num;
		}
	}
	public long pop() {
		if(isEmpty()) {
			return 0L;
		}
		return stackArray[top--];
	}
	
	public long peep() {
		return stackArray[top];
	}
	
	private boolean isEmpty() {
		return (top==-1);
	}
	
	private boolean isFull() {
		return (top==stackSize-1);
	}
	public static void main(String[] args) {
		MyStack stackObj=new MyStack(5);
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.push(40);
		stackObj.push(50);
		stackObj.push(160);
		
		while(!stackObj.isEmpty()) {
			System.out.print(stackObj.pop());
	         System.out.print(" ");
		}
	}

}
