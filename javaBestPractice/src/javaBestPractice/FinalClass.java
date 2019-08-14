package javaBestPractice;

class FinalA{
	int x;
	
	void show() {
		System.out.println(x);
	}
}
public class FinalClass {

	static FinalA swap(FinalA obj1, FinalA obj2) {
		final FinalA temp=obj1;
		temp.x=10;
		return temp;
	}
	public static void main(String[] args) {
		final 	FinalA obj1=new FinalA();
		FinalA obj2=new FinalA();
		obj1.x=30;
		obj1.show();
		//obj1=new FinalA();//The final local variable obj1 cannot be assigned. It must be blank and not using a compound assignment
		FinalA obj3=swap(obj1,obj2);
		obj3.show();
	}

}
