package javaBestPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {

	public static void main(String[] args) {
		//first Non Repeated character of String
		String str="Program";
		char[] arr=str.toLowerCase().toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c :arr){
		 if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}
		 else{
				map.put(c,1);
		 }
		}
		 for(Map.Entry<Character, Integer> set: map.entrySet()){
				if(set.getValue()==1){
					System.out.println("First Non Repeated Character: "+set.getKey());
					break;
				}
		 }
		
		//first Non Repeated character of String without Map
		 String nonstr="Programp";
		 char[] nonarr=nonstr.toLowerCase().toCharArray();
		 StringBuilder temp=new StringBuilder(nonstr.toLowerCase().toString());
		 for(int i=0;i<temp.length();i++){
		 	int index=temp.indexOf(""+nonarr[i]);
		 	int lastIndex=temp.lastIndexOf(""+nonarr[i]);
		 	if(lastIndex - index < 1){
		 		System.out.println("First Non Repeated Character: "+nonarr[i]);
		 		i=nonarr.length;
		 	}
		 }
		

	}

}
