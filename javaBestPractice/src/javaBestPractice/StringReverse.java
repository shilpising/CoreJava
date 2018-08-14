package javaBestPractice;

class StringStack{
	int lmax;
	char[] list;
	int top;
	StringStack(int i){
		lmax=i;
		list =new char[lmax];
		top=-1;
	}
	
	public void push(char str) {
		if(top!=lmax-1) {
			list[++top]=str;
		}
	}
	public char pop() {
		if(top==-1) {
			return 0;
		}
		return list[top--];
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
public class StringReverse {

	public static void main(String[] args) {
		
		StringStack stackObj=new StringStack(50);
		
		String input="Java Source and Support";
		String output="";
		System.out.println("Original String--"+input);
		for(int i=0; i<input.length();i++) {
			stackObj.push(input.charAt(i));
		}
		while(!stackObj.isEmpty()) {
			output=output+stackObj.pop();
		}
		System.out.println("Reversed String--"+output);
	}

}
