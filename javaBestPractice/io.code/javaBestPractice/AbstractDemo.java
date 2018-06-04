package javaBestPractice;

abstract class Shape{
	Shape(){}
	abstract void draw();
	void display() {
		System.out.println("inside Shape Display");
				}
}

class Rectangle extends Shape{
	Rectangle(){
		super();
		}
	void draw() {
		System.out.println(("inside Rectangle draw"));
	}
	void display() {
		System.out.println("inside Rectngle display");
	}
}

class Triangle extends Rectangle{
	void draw() {
		System.out.println("inside Triangle");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Shape s1=new Rectangle();
		s1.draw();
		s1=new Triangle();
		s1.draw();
		//cannot instantiate Shape
		//s1=new Shape();
		
		Rectangle r1=new Rectangle();
		r1.draw();
		r1=new Triangle();
		r1.draw();
		
		Triangle t1=new Triangle();
		t1.draw();
		//cannot convert rectangle to triangle
		//t1=new Rectangle(); 
		//cannot convert shape to triangle
		//t1=new Shape();
	}

}
;