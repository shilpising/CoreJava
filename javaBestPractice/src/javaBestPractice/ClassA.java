package javaBestPractice;


//Inheritance is tightly coupled whereas composition is loosely coupled. Let’s assume we have below classes with inheritance.
public class ClassA  {

	public void foo(){	
	}
	
	public int bar(){
		return 0;
	}
}

class ClassC{
	 void show() {
		System.out.println("show ClassC");
	}
}
class ClassB extends ClassC{
	
	/*public void bar(){//The return type is incompatible with ClassA.bar().
		
	}*/
	
ClassA classA = new ClassA();
	
	public void bar(){
		classA.foo();
		classA.bar();
		show();
	}
}
