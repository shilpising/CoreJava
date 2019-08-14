package javaBestPractice;

public class ReverseWord {

	public static void main(String[] args) {
		//reverse words in a sentence without using library method
		String str="Java is best programming language";
		String[] temp=str.split(" ");
		Stack stack=new Stack(temp.length);
		StringBuilder finals=new StringBuilder();
		for(int i=0 ; i<temp.length; i++){
				stack.push(temp[i]);
			}
		while(!stack.isEmpty()){
					finals.append(stack.pop()+" ");
				}
	
		System.out.println("Reverse word String---"+ finals);
	}

}

class Stack{
	String[] arr;
	int top=-1;
	int len;
	Stack(int len){
		arr=new String[len];
		this.len=len;
	}
	public void push(String temp){
		if(top<len-1){
			arr[++top]=temp;
					}
	}
	public String pop(){
		if(top!=-1){
			return arr[top--];
		}
		return "";
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
