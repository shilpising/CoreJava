package javaBestPractice;

public class DigitCheck {

	public static void main(String[] args) {
		//check if a String contains only digits
		String str="1234$ k";
		boolean flag=false;
		for(int i=0;i<str.length();i++){
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
				{ 
					flag=true;
					i=str.length();
				}
			if(flag==false){
				System.out.println("String contains only digits");
			}
			else {
				System.out.println("String contains characters other than digits");
			}
			}
		}
		

	}

}
