package javaBestPractice;

public class ShuffleString {

	public static void main(String[] args) {
		String str1="abc";
		String str2="def";
		boolean flag=true;
		String str3="dabecf";
		char[] temp1=str1.toCharArray();
		char[] temp2=str2.toCharArray();
		for(int i=0;i<temp1.length-1;i++) {
			if(str3.indexOf(""+temp1[i+1])- str3.indexOf(""+temp1[i])<=0) {
				flag=false;
			}
		}
		for(int i=0;i<temp2.length-1;i++) {
			if(str3.indexOf(""+temp2[i+1])- str3.indexOf(""+temp2[i])<=0) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Shuffele String");
		}
	}

}
