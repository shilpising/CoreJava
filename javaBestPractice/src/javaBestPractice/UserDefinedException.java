package javaBestPractice;

class UserException extends Exception{
	UserException(){
		super("invalid");
	}
	UserException(String msg){
		super(msg);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		int i=10;
		try {
			int j=10/-2;
			if(j<0) {
				throw new UserException("divide by zero");
			}
			System.out.println(10/0);
		}catch(UserException e) {
			try {
				throw new ArithmeticException("divide by zero inside catch");
			} catch (ArithmeticException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			try {
				throw new Exception("divide by zero inside finally");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				

	}

}
