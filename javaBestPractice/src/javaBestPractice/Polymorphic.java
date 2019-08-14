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
	
	/*public void show() {
		System.out.println("inside Polymorphic");
	}*/
	public void show(int m) {
		System.out.println("inside Polymorphic overloading");
	}
	public void show(Integer m) {
		System.out.println("inside Polymorphic");
	}
	/*public int show(Integer m) {
		System.out.println("inside Polymorphic");
	}*/
	/*private void show(Integer m) {
		System.out.println("inside Polymorphic");
	}*/
	public void show(Integer m,String s) {
		System.out.println("inside Polymorphic");
	}
	public void show(String s,Integer m) {
		System.out.println("inside Polymorphic");
	}

	public String getDescription(Object obj){ return obj.toString(); } 
	public String getDescription(String obj){ return obj; }

	/*public void getDescription(String obj){
		   return obj;
		}*/
	public static void main(String[] args) {
		Poly obj=new Polymorphic();
		obj.show();
		Poly2 obj1=new Polymorphic();
		obj1.show();
	//	obj1.show(5); The method show() in the type Poly2 is not applicable for the arguments (int) i.e. method overloading is not possible in case of inheritance
		((Polymorphic)obj1).show(5);
		obj1.display();
		System.out.println("desc"+new Polymorphic().getDescription(new Polymorphic()));
		System.out.println("desc"+new Polymorphic().getDescription("abc"));
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
