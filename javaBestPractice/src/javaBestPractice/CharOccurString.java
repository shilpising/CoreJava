package javaBestPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharOccurString {

	public static void main(String[] args) {
		String arr="abaxxdfggabh";
		char[] arrChar=arr.toCharArray();
		Arrays.sort(arrChar);
		System.out.println(arrChar);
		Map<Character,Integer> map=new HashMap<>();
		for(char c:arrChar){
			if(map.containsKey(c)) {
				map.put(c, (map.get(c)+1));
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
	}

}
