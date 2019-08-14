package javaBestPractice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str="bananasas";
		char[] temp=str.toCharArray();
		StringBuilder finals= new StringBuilder(str);
		for(int i=0;i<temp.length;i++) {
			int index=finals.indexOf(""+temp[i]);
			int lastindex=finals.lastIndexOf(""+temp[i]);
			if(lastindex - index >=1){
				finals.deleteCharAt(lastindex);
			}
		}
		System.out.println(finals);
	}

}
