package javaBestPractice;

public class Singleton {

	private volatile static Singleton _instance;
	String name;
	private Singleton() {
		System.out.println("\ninside Singleton constructors");
		name="shilpi";
	}
	public static Singleton getInstance() {
		if(_instance==null) {
			System.out.println("inside new object creation");
			_instance=new Singleton();
		}
		return _instance;
	}
	public void show() {
		System.out.println("hello"+name);
	}
	public static void main(String[] args) {
		Singleton obj=Singleton.getInstance(); 
		Singleton obj1=Singleton.getInstance(); 
		obj.show();
		obj1.show();
	}

}
