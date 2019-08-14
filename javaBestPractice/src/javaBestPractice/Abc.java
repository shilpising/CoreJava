package javaBestPractice;

import java.io.IOException;
import java.util.Arrays;

abstract class Test{
	int i=10;
	abstract void testshow() throws IOException;
	void testDisplay() {
		System.out.println("abstract class testDisplay");
	}
	
}


interface TestInt{
	static int i=30;
	 void testshow()throws IOException;
	 /*default void testDisplay() {
		 int i=50;
			System.out.println("Interface class TestInt"+TestInt.i);
		}*/
	
}
public class Abc extends Test implements TestInt{//The inherited method Test.testDisplay() cannot hide the public abstract method in TestInt
	int i=20;
	public void testshow() throws IOException{
		System.out.println("Abc class testshow");
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	/*public void testDisplay() {
		System.out.println("Abc class testDisplay");
	}*/
	public void Abcshow() {
		System.out.println("Abc class Abcshow");
	}
	public static void main(String[] args) throws IOException {
			Test t=new Abc();
		System.out.println(t.i);
		System.out.println(((Abc)t).i);
		t.testshow();
		t.testDisplay();
		((Abc) t).Abcshow();
		TestInt t1=new Abc();
		System.out.println(t1.i);
		System.out.println(((Abc)t1).i);
		t1.testshow();
		( (Abc)t1).testDisplay();
		((Abc) t1).Abcshow();
		Integer num=12543;
		char a[]=num.toString().toCharArray();
		//Arrays.sort(a);
		
		System.out.println("Original number: "+num);
		for(int i=a.length-1;i>0;--i) {
			char t=a[i];
			a[i]=a[i-1];
			a[i-1]=t;
			int n=Integer.parseInt(String.valueOf(a));
			if(n>num) {
				System.out.println("Next higher number"+n);
				i=-1;
			}
		}
	//	t1.testDisplay();
		
		/*String n=new String("new");
		String o=new String("new");
		System.out.println(n==o);
		String p="new";
		System.out.println(n==p);
		o.intern();
		System.out.println(p==o);
		String q="new";
		System.out.println(p==q);
		
		float f=0.1F;
		
		String r=null;
		System.out.println(r);*/
	}

}


