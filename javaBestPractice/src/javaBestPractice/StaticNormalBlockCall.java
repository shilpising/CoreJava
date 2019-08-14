package javaBestPractice;

class StaticBase{
	int x;
	static int y;
	{
		try {
		System.out.print("7 " );//+ this.hashCode());
		}finally {
		}
		
	}
	
	static {
		System.out.print("8 " );//+ this.hashCode()); --Cannot use this in a static context
	}
	StaticBase(){
		System.out.print("9 " );
		System.out.print("++x--"+ ++x);
		System.out.print(" ++y--"+ ++y);
	}
}
public class StaticNormalBlockCall extends StaticBase {
	int x;
	static int z;
	
	{
		System.out.print(" 1 " );//+ this.hashCode());
	}
	
	
	static {
		try {
			System.out.print("2 ");
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.print("3 ");
		}
	}
	StaticNormalBlockCall(){
		System.out.print("4 ");
		x=5;
	}
	static {
		System.out.print("5 " );//+ this.hashCode()); --Cannot use this in a static context
	}
	{
		System.out.print("6 ");
	}

	public static void main(String[] args) {
		StaticBase obj1=new StaticNormalBlockCall();
		System.out.println();
		StaticNormalBlockCall obj=new StaticNormalBlockCall();
		System.out.println("\n x="+obj1.x);
		System.out.println("x="+obj.x);
		//System.out.println("\n z="+obj1.z);//z cannot be resolved or is not a field
		System.out.println("\n z="+obj.z);
		StaticBase obj2=new StaticBase();
		System.out.println("y="+obj2.y);
		//StaticNormalBlockCall obj3=(StaticNormalBlockCall) new StaticBase();
		//System.out.println("y="+obj3.y);//Exception in thread "main" java.lang.ClassCastException: javaBestPractice.StaticBase cannot be cast to javaBestPractice.StaticNormalBlockCall
		//int a=Math.abs(10.5);//cannot convert double to int
		Double a=Math.abs(10.5);
		System.out.println("\n"+a);
		a=Math.abs(- 10.5);
		System.out.println(a);
		float b=(float) Math.abs(- 11.5);
		System.out.println(b);
		int c=(int) Math.abs(- 11.5);
		System.out.println(c);
		char d=(char) Math.abs(- 11.5);
		System.out.println(d);
		
		char e='X';
		System.out.println(e);
		char f=(int)69.6;
		System.out.println(f);
		char g='Y' + 9;
		System.out.println(g);

	}

}
