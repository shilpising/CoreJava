package javaBestPractice;

public class TryFinally {

	
	public int divide(int a) throws Exception{
		int b=0;
		try{
			b = 10/a;
			//return b;
			 System.exit(0);
		}
		catch(Exception e) {
			//throw e;
			return 7;//unreachable code
		}
		catch(Error e) {
			throw new java.lang.OutOfMemoryError();
			//return 7;//unreachable code
		}
		finally{
			System.out.println("Finally");
			return 3;
		}
	}
	public static void main(String[] a){
		int result=0;
		try{
			TryFinally obj = new TryFinally();
			result = obj.divide(1);
			System.out.println("result Main : " + result);
		}catch(Exception e)	{
			System.out.println("Divide by Zero 1..... "+e.getMessage());
			e.printStackTrace();
		}catch(Error e)	{
			System.out.println("Divide by Zero 1..... "+e.getMessage());
		}
	}
	

}
