package javaBestPractice;

interface Poly{
	public void show();
}

abstract class Poly2{
	public  void show() {
		System.out.println("inside show Poly2");
	}
	public void display() {
		System.out.println("inside display Poly2");
	}
}

public class Polymorphic  extends Poly2 implements Poly {
	
	public void show() {
		System.out.println("inside Polymorphic");
	}

	public static void main(String[] args) {
		Poly obj=new Polymorphic();
		obj.show();
		Poly2 obj1=new Polymorphic();
		obj1.show();
		obj1.display();
		//obj1= obj; //Type mismatch: cannot convert from Poly to Poly2
		obj1=(Poly2) obj;
		obj1.show();
		obj1.display();
		//obj= obj1; //Type mismatch: cannot convert from Poly2 to Poly
		obj=(Poly)obj1;
		obj.show();
		//obj.display(); //The method display() is undefined for the type Poly
	}

}
