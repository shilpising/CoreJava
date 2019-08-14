package javaBestPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("stack");
		strings.add("overflow");
		strings.add("google");
		strings.add("msn");
		strings.add("MSN");
		strings.add("stack");
		strings.add("overflow");
		strings.add("stack");
		int count=1;
		HashMap<String,Integer> duplicates=new HashMap<String,Integer>(); 
		for(int i=0;i<strings.size();i++) {
			count=1;
			for(int j=0;j<strings.size();j++) {
				if(strings.get(i).equals(strings.get(j))&& i!=j) {
					duplicates.put(strings.get(i), ++count);
				}
			}
		}
		System.out.println("Duplicates"+duplicates);
		
		//Finding duplicates using HashSet DS
		String[] myArray = { "ab", "cd", "ab", "de", "cd" };
		Set<String> dupes=new HashSet<String>();
		for(String str:myArray) {
			if(!dupes.add(str)) {
				System.out.println("Duplicat element:  "+str);
			}
		}
		
		
		
	}

}
