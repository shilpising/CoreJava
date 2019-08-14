package javaBestPractice;


class A{
	public void method1() {
		System.out.println("inside A.method1");
	}
}
class B extends A{
	public void method2() {
		System.out.println("inside B.method2");
	};
}
class C extends B{
	public void method1() {
		System.out.println("inside C.method1");
	};
}

public class InterfaceMethodImpl {

	public static void main(String[] args) {
		B obj=new C(); //javaBestPractice.B cannot be cast to javaBestPractice.C
		obj.method1();

	}

}
