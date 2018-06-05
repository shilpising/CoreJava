package javaBestPractice;

public class MainVariant {
	
	static {
		System.out.println("inside static block");
		
	}

	/*public static void main(String[] args) {
		System.out.println("inside main");

	}*///the main method is static Java virtual Machine can call it 
	//without creating any instance of a class which contains the main method
	
	/*public static void main(String... args) {//varargs java1.5 onwards
		System.out.println("inside main");

	}*/
	
	public static final synchronized strictfp  void main(String[] shilpi) throws Exception {
	System.out.println("inside main");

	}
	
	/*static data are loaded into separate memory inside JVM called context which is created when a class is loaded
	main method is static than it will be loaded in JVM context and are available to execution.*/
}
