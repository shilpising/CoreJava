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

	}

	@Override
	public void show() {
		System.out.println("hello");
		
	}

}
