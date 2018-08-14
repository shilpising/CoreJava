package javaBestPractice;

interface interface1{
	void show();
}

interface interface2{
	void show();
}
public class InterfaceImplementation implements interface1, interface2 {

	public static void main(String[] args) {
		InterfaceImplementation obj=new InterfaceImplementation();
		obj.show();
		obj.display();
		interface1 intObj=new InterfaceImplementation();
		//intObj.display(); //The method is undefined for the type interface1
	}

	@Override
	public void show() {
		System.out.println("hello");
		
	}
	public void display() {
		System.out.println("hello display");
		
	}
}
