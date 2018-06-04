package javaBestPractice;


import io.javabrains.Access;
/* Note: Identify the error, rectify it and get the output. */

public class AccessSpecifierDemo extends Access {

	public static void main(String[] args) {
		Access a=new Access();
		//System.out.println(a.a);//Compiler error : The field Access.a is not visible
		//System.out.println(a.b);//Compiler error : The field Access.b is not visible
		//System.out.println(a.c);//Compiler error : The field Access.c is not visible
		//System.out.println(a.d);

		
	
	}
	

}
