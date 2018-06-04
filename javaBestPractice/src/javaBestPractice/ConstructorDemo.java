package javaBestPractice;

abstract class Student1{
	protected String name;
	Student1(){
		System.out.println("Student Base constructor");
	}
	Student1(String name){
		System.out.println("Student parameter constructor");
	}
}

class PerceptionUser1 extends Student1{
	String password;
	PerceptionUser1(){
		System.out.println("PerceptionUser Base Constructor");
	}
	PerceptionUser1(String name, String pwd){
		super(name);
		System.out.println("PerceptionUser parameter constructor");
	}
}
class ConstructorDemo{
	public static void main(String args[]){
	//	Student s = new Student();
		Student1 s1 = new PerceptionUser1();
		PerceptionUser1 p=new PerceptionUser1();
		PerceptionUser1 p1=new PerceptionUser1("jack","infy@123");
	}
}