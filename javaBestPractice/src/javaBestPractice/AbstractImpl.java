package javaBestPractice;

abstract class  AbsClass{
	int b=1;
	int a=1;
	 abstract void show();
	 void display() {
		 System.out.println("inside abstract class display");
	 }
	 AbsClass(){
		 System.out.println("Inside abstract class constructor");
	 }
	 AbsClass(int n){
		 b=n;
		 System.out.println("Inside abstract class param constructor");
	 }
}

public class AbstractImpl extends AbsClass {
	int b=5;
	int a=10;
	void show() {
		System.out.println("Inside show"+a);
	}
	void display() {
		 System.out.println("inside child class display");
	 }
	AbstractImpl(){
		System.out.println("Inside impl constructor");
	}
	AbstractImpl(int n){
		b=n;
	}
	public static void main(String shilpi[]) {
		AbsClass obj=new AbstractImpl();
		AbsClass obj1=new AbstractImpl(5);
		obj1.display();
		obj.show();
		System.out.println(obj1.a);
		System.out.println(obj.a);
	}

}
