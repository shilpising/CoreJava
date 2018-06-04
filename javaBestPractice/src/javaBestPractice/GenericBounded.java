package javaBestPractice;
/* Note: Identify the error, rectify the same and get the output. */

class GenNumber<T extends Number>{
	T number;

	GenNumber(T number){
		this.number=number;
	}

	void disp(){
		System.out.println("value is "+number);
	}
}

class GenericBounded{
	public static void main(String arg[]){
		GenNumber<Integer> genInteger=new GenNumber<Integer>(10);
		GenNumber<Double> genDouble=new GenNumber<Double>(10.55);
		GenNumber genLong=new GenNumber(1000L);
		/*	GenNumber<String> genString=new GenNumber<String>("Jack");
Multiple markers at this line
	- Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends 
	 Number> of the type GenNumber<T>*/
		genInteger.disp();
		genDouble.disp();
		genLong.disp();

	}
}

