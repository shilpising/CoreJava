package javaBestPractice;

/* Note: Analyze the program and understand the output. */
public class AbstractDemo1 {

	/*Compiler will not find main.
	 * public void main(String[] args) {
		System.out.println("hello");

	}
*/
	
	/*Error: Main method not found in class javaBestPractice.AbstractDemo1, please define the main method as:
   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application
	 * 
	 * 
	 * static void main(String[] args) {
		System.out.println("hello");

	}
	*/
	
	/*Return type missing
	 * 
	 * public static main(String[] args) {
		System.out.println("hello");

	}*/
	
	public static void main(String shilpi[]) {
		Shape s1=new Rectangle();
		s1.display();
		s1.draw();
		Rectangle r1=new Rectangle();
		r1.display();
		r1.draw();

	}
	
	
}

