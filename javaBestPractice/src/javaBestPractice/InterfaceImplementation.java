package javaBestPractice;

interface interface1{
	void show();
	int value1=10;
	//private final static int answer = 42;// Illegal modifier for the interface field interface1.answer; only public, static & final are permitted
	public static int answer=42;
}

interface interface2{
	int value1=20;
	void show();
}
public class InterfaceImplementation implements interface1, interface2 {

	public static void main(String[] args) {
		InterfaceImplementation obj=new InterfaceImplementation();
//		obj.value1;//The field obj.value1 is ambiguous
		System.out.println(interface1.value1);
//		System.out.println(obj.interface1.value1);
		obj.show();
		obj.display();
		interface1 intObj=new InterfaceImplementation();
		//intObj.display(); //The method is undefined for the type interface1
		System.gc();
		Runtime.runFinalizersOnExit(true);
	}

	@Override()
	public void show() {
		System.out.println("hello");
		
	}
	
	public void finalize(){
		System.out.println("Garbage1");
	}
public void finalize(int i){
	System.out.println("Garbage2");
	}
	
	public void display() {
		System.out.println("hello display");
		
	}
}
