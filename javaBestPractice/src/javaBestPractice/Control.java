package javaBestPractice;

class Control
{
	public static void main(String arg[])
	{

		boolean ok=true;
		if(ok)//if int ok=0;Type mismatch: cannot convert from int to boolean
		{
			System.out.println("TRUE");
		}
		else
		{
	    	System.out.println("FALSE");
		}

 	}
}
