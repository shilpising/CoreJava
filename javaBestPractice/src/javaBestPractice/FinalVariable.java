package javaBestPractice;
/* Note: Identify the error, rectify the same and get the output. */
public class FinalVariable {
	
	private int i=10;
	private final int j=20;
	
	FinalVariable(int i){
		this.i=i;
		//j=25;//The final field FinalVariable.j cannot be assigned
	}
	void disp() {
		System.out.println(i +"  "+j);
		//i=35;j=45;//The final field FinalVariable.j cannot be assigned
		System.out.println(i +"  "+j);
	}

	public static void main(String[] args) {
		FinalVariable f=new FinalVariable(5);
		f.disp();
	}

}
