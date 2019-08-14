package javaBestPractice;

//analyse the code and its o/p to get the count of new object created.
public class StringExample {

	public static void main(String[] args) {
		/*String s1=new String("abc");
		String s2="abc";
		System.out.println(s1);
		s2=s1+s2;
		
		String s4=new String("abc");
		String s3=s4;
		String s5=s1.substring(0,3);
		String s6="abc";
		System.out.println("  s1="+s1.hashCode()+" s2="+s2.hashCode());
		System.out.println("  s4="+s4.hashCode()+" s3="+s3.hashCode());
		System.out.println("  s5="+s5.hashCode()+" s6="+s6.hashCode());
		System.out.println("  s1="+s1+" s2="+s2);
		System.out.println("  s4="+s4.hashCode()+" s3="+s3.hashCode());
		System.out.println("  s5="+s5.hashCode()+" s6="+s6.hashCode());
		//System.out.println(s2==s3);
		//System.out.println(s3==s1);
		System.out.println(s6==s1);
		System.out.println(s3==s4);
		//System.out.println(s5);
		System.out.println(s4==s5);
		System.out.println(s2==s6);
		
		String str = "Java is best programming language";

		if(str.indexOf("Java") != -1){
		     System.out.println("String contains Java at index :" + str.indexOf("Java"));
		}

		if(str.matches("J.*")){
		     System.out.println("String Starts with J");
		}

		str ="Do you like Java ME or Java EE";

		if(str.lastIndexOf("Java") != -1){
		      System.out.println("String contains Java lastly at: " + str.lastIndexOf("Java"));
		}
		
		String str1 = "Java is bestprogramming language";
	    
		//this will return part of String str from index 0 to 12
		String subString = str1.substring(0,12);
		    
		System.out.println("Substring: " + subString);
		
		String name="shilpi";
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.substring(0,name.length()-1));
		System.out.println("---"+name.substring(6));
		System.out.println(palindrome("OPPO"));
		System.out.println(palindrome("shilps"));*/
		
		/*String s = "Geeks", g = ""; 
        String f = s.concat(g); 
        if (f == s) 
            System.out.println("Both are same"); 
        else
            System.out.println("not same"); 
        String e = s + g; 
        if (e == s) 
            System.out.println("Both are same"); 
        else
            System.out.println("not same"); */
		
		String s = new String("shilpi"); // "abc" will not be added to String constants pool.
	    System.out.println(System.identityHashCode(s));
	    s = s.intern();// add s to String constants pool
	    System.out.println(System.identityHashCode(s));
	    String s2="shilpi";
	    System.out.println(System.identityHashCode(s2));
	    String str1 = new String("hello");
	    String str2 = "hello";
	    String str3 = str1.intern();
	    System.out.println(System.identityHashCode(str1));
	    System.out.println(System.identityHashCode(str2));
	    System.out.println(System.identityHashCode(str3));
	}
	
	public static boolean palindrome(String str) {
		System.out.println(str);
		if(null!=str && (str.length()==0 ||str.length()==1)) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			System.out.println(str.substring(1,str.length()));
			return palindrome(str.substring(1,str.length()-1));
		}
		return false;
		
	}

}
