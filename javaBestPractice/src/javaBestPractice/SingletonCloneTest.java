package javaBestPractice;

class SingletonClone implements Cloneable{
	private SingletonClone() {
		
	}
	private static SingletonClone INSTANCE;
	public static SingletonClone getInstance() {
		if(INSTANCE==null) {
			System.out.println("inside new object creation");
			INSTANCE=new SingletonClone();
		}
	 return INSTANCE;
	}
 public Object clone() throws CloneNotSupportedException{
	//return super.clone();
	 throw new CloneNotSupportedException();
 }
}

public class SingletonCloneTest {

	public static void main(String[] args) {
		SingletonClone obj1=SingletonClone.getInstance();
		System.out.println("obj1"+obj1);
		try {
			SingletonClone obj2=(SingletonClone)obj1.clone();
			System.out.println("obj2"+obj2);
		}catch(Exception e) {
			System.out.println("Exception");e.printStackTrace();
		}
	}

}
