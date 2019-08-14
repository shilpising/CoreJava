package javaBestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringPrograms {

	public static void main(String[] args) {
		maximumOccuringCharacter("Java");
		maximumOccuringCharacter("Jaava");
		maximumOccuringCharacter("Javva");
		maximumOccuringCharacter("Javvva");
		
		removeDuplicateCharFromString("Javvva");
		removeDuplicateCharFromString("JavVva");
		
		printDuplicateCharFromString("C++");
		printDuplicateCharFromString("Java and JavaScript");
		
		printStringsInRotation("XYZ","ZXY");
		printStringsInRotation("XYZ","YXZ");
		printStringsInRotation("abcd","bcda");
		
		removeCharFromString("Programming",'m');
		
		System.out.println("Palindrom 121: "+palindrome("121"));
		System.out.println("Palindrom 121: "+palindrome("dalda"));
		System.out.println("Palindrom 121: "+palindrome("shilpi"));
		
		anagram("Army","Mary");
	}
	
	public static void maximumOccuringCharacter(String str){
		Map<Character,Integer> map=new HashMap<>();
		char[] strarr=str.toCharArray();
		for(int i=0;i<strarr.length;i++){
			if(map.containsKey(strarr[i])){
				map.put(strarr[i],map.get(strarr[i])+1);
			}
			else{
				map.put(strarr[i],1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
		int count=1;
		List<Character> max=new ArrayList<>();
		for(Map.Entry<Character,Integer> entry:entrySet){
			if(entry.getValue()>count){
				if(!max.isEmpty()) {
					max.removeAll(max);
				}
				max.add(entry.getKey());
				count=entry.getValue();
				
			}
			else if(entry.getValue()==count){
				max.add(entry.getKey());
			}
		}
		
		
		System.out.println("maximumOccuringCharacter: "+max+" count: "+count);
}

	public static void removeDuplicateCharFromString(String str){
		System.out.println("String with duplicates:  "+str);
		StringBuilder sb=new StringBuilder(str);
		char[] arr=str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length;i++){
			int index=sb.toString().toLowerCase().indexOf(String.valueOf(arr[i]));
			int lastindex=sb.toString().toLowerCase().lastIndexOf(String.valueOf(arr[i]));
			if(lastindex-index>0){
				sb.deleteCharAt(lastindex);
			}
		}
		System.out.println("String without duplicates:  "+sb);
	}
	
	public static int removeDuplicateCharFromString(int str){
		
		System.out.println("String without duplicates:  ");
		return 0;
	}
	
	public static void removeDuplicateCharFromString(long str){
		
		System.out.println("String without duplicates:  ");
		//return 0;
	}
	
	public static void removeDuplicateCharFromString(float str){
		
		System.out.println("String without duplicates:  ");
		//return 0;
	}
	
	public static void printDuplicateCharFromString(String str){
		System.out.println("\nprintDuplicateCharFromString-->Original String with duplicates:  "+str);
		System.out.print("printDuplicateCharFromString--> Duplicates Characters:  ");
		StringBuilder sb=new StringBuilder(str.toLowerCase());
		char[] arr=str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length;i++){
			if( sb.lastIndexOf(String.valueOf(arr[i])) - sb.indexOf(String.valueOf(arr[i])) > 0){
			//	sb.deleteCharAt(sb.lastIndexOf(String.valueOf(arr[i])));
				while(sb.indexOf(String.valueOf(arr[i]))>=0) {
					sb.deleteCharAt(sb.indexOf(String.valueOf(arr[i])));
				}
			System.out.print("\t"+arr[i]);
			}
		}
	}
	

	public static void printStringsInRotation(String input,String rotated){
		System.out.println("\n\nprintStringsInRotation-->Original String:  "+input);
		System.out.println("printStringsInRotation-->String to verify:  "+rotated);
		boolean rotation=true;
		if (input == null || rotated == null) {
			rotation= false;

        } else if (input.length() != rotated.length()) {
        	rotation= false;

        }

        int index = rotated.indexOf(input.charAt(0));
        if (index > -1) {

            if (input.equalsIgnoreCase(rotated)) {
            	rotation= true;
            }

            int finalPos = rotated.length() - index;
            rotation= rotated.charAt(0) == input.charAt(finalPos)
                    && input.substring(finalPos).equals(
                            rotated.substring(0, index));
        }
      
    if(rotation==true){
			System.out.println("Strings are rotational");
		}
	}
	
	public static void removeCharFromString(String str, char c) {
		System.out.println(" removeCharFromString original string: "+str+" remove char: "+c);
		StringBuilder sb=new StringBuilder(str);
	    while(sb.indexOf(String.valueOf(c))>=0) {
	    	sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
	    }
	    System.out.println("Resultant string:\t"+sb.toString());
	}
	
	public static boolean palindrome(String str){
		if(str.length()==0|| str.length()==1){
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return palindrome(str.substring(1,str.length()-1));
		}
		return false;
	}
	
	public static void anagram(String str,String ana){
		if(str.length()==ana.length()){
			char[] temp=str.toLowerCase().toCharArray();
			StringBuilder sb=new StringBuilder(ana.toLowerCase());
			for(int i=0;i<temp.length;i++){
				if(sb.indexOf(String.valueOf(temp[i]))>=0){
					sb.deleteCharAt(sb.indexOf(String.valueOf(temp[i])));
				}
			}
			if(sb.toString().isEmpty()){
				System.out.println(ana+"  is Anagram");
			}
			else{
				System.out.println(ana+"  is not Anagram");
			}
		}
	}
}
