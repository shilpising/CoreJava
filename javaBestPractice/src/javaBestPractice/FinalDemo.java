package javaBestPractice;

class Parent{
	int a=5;
	static int c=40;
	 void disp(){
		System.out.println("Final disp method");
	}
	 void show(){
			System.out.println("parent show method");
		}
}

class Child extends Parent{
	int a=10;
	int b=20;
	static int c=30;
	void disp(){
		System.out.println("Child Final disp method");
	}
	
	void out(){
		System.out.println("child out method");
	}
}

class FinalDemo{
	public static final void main(String args[]){
		Parent child=new Child();
		child.disp();
		child.show();
		((Child) child).out();
		System.out.println(((Child) child).a);
		System.out.println(((Child) child).b);
		System.out.println(child.c);
		System.out.println(((Child) child).c);
		System.out.println(((Child) child).b);
		/*Child c=(Child) new Parent();
		c.show();
		c.disp();*/
	}
}

/* Note: Identify the error, rectify it and get the output. */
