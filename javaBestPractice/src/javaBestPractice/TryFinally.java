package javaBestPractice;

public class TryFinally {

	
	public int divide(int a) {
		int b=0;
		try{
			b = 10/a;
			return b;
			// System.exit(0);
		}
		catch(ArithmeticException e) {
			throw e;
			//return 7;//unreachable code
		}
		catch(Exception e) {
			throw e;
			//return 7;//unreachable code
		}
		catch(Error e) {
			throw new java.lang.OutOfMemoryError();
			//return 7;//unreachable code
		}
		finally{
			System.out.println("Finally");
			//return 3;
		}
	}
	public static void main(String[] a){
		int result=0;
		Integer[][] intss = { { 1, 2, 3 }, { null,null }, { 7, 8, 9 } };
		System.out.println("value = " + intss[1][2].intValue());//NullPointerException
		Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
		System.out.println("value = " + ints[1][1].intValue());//java.lang.ArrayIndexOutOfBoundsException
		try{
			TryFinally obj = new TryFinally();
			result = obj.divide(0);
			System.out.println("result Main : " + result);
		}catch(Exception e)	{
			System.out.println("Divide by Zero 1..... "+e.getMessage());
			e.printStackTrace();
		}catch(Error e)	{
			System.out.println("Divide by Zero 2..... "+e.getMessage());
		}
		finally {
			System.out.println("Inside finally");
		}
	}
	

}
