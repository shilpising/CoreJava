package javaBestPractice;

class Swap{
	Integer i;
	{
		System.out.println(i);
	}
	Swap(int t){
		System.out.println(i);
		i=t;
	}
	public static void swapIn(Swap obj1, Swap obj2) {
		Swap temp=obj1;
		obj1=obj2;
		obj2=null;
	}
	
}
public class SwapObject {

	
	public static void main(String[] args) {
		int i;
		Swap obj1= new Swap(5);
		Swap obj2= new Swap(10);
		Swap.swapIn(obj1,  obj2);
		System.out.println(obj1.i+","+obj2.i);
	}

}
