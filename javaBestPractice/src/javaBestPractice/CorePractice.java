package javaBestPractice;

class Base{
	int i;
	Base(){
		method1();
	}
	void method1(){
		i=20;
	}
}

public class CorePractice extends Base{
	int i,j;
	CorePractice(int t){
		i=t;
		j=i+10;
	}
	void method1(){
		super.i=30;
	}
	public static void main(String[] args) {
		CorePractice obj=new CorePractice(5);
		obj.method1();
		System.out.println("i="+obj.i+"j="+obj.j);
		Base base=new CorePractice(4);
		System.out.println("i="+base.i);
	}

}
