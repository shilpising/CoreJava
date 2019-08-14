package javaBestPractice;

public class VowelConsonent {

	public static void main(String[] args) {
		//count number of vowels and consonants in a String
		String str="Javahgjh";
		int vowel=0,consonants=0;
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
				++vowel;
			}
			else{
				++consonants;
				}
		}
		System.out.println("Vowels="+ vowel);
		System.out.println("consonants="+ consonants);


	}

}
