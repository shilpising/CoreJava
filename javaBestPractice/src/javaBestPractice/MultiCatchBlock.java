package javaBestPractice;

public class MultiCatchBlock {

	public static void main(String[] args) {
		char i=49;//65;
		try {
			if(i>65) {
				throw new IllegalArgumentException();
			}
			int j=(Integer.parseInt(String.valueOf(i)))/0;
		}catch(ArithmeticException|NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
