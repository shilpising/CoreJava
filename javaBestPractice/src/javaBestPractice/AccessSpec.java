package javaBestPractice;

class Access
{
 int a;
	protected int d;
}

class AccessSpec
{
	public static void main(String arg[])
	{
			Access access=new Access();
			System.out.println(access.a);
			System.out.println(access.d);

	}
}