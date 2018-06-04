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
		}catch(Exception e) {
			e.printStackTrace();
		}
				

	}

}
