package javaBestPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo{
    public static void main(String[] args){
		Map<Integer,String> hashmap=new HashMap<>();

		hashmap.put(1001,"Jerry");
		hashmap.put(1005,"12");
		hashmap.put(1003,"Mary");
		hashmap.put(1001,"yyyy");
		hashmap.put(1002,"jack");
		hashmap.put(1004,"Jerry");
		hashmap.put(null, null);
		Integer k=new Integer(50);
		Integer j=new Integer(50);
		
		System.out.println("\n---Integer cache test----");
		System.out.println(k==j);
		hashmap.put(k,"ss");
		hashmap.put(j,"dd");
		
		Integer i=null;
	     String str="java programming basics Interview questions";
	 
	     hashmap.put(i, str);
	 
	    System.out.println(hashmap.size()+"----"); 
		Set<Integer> set=hashmap.keySet();
		Iterator<Integer> iterator = set.iterator();

	    while (iterator.hasNext()){
	            Integer key=(Integer)iterator.next();
	            System.out.print(key + " = ");
	            System.out.println((String)hashmap.get(key) + " and : ");
        }
	    
	    
	    for (String name : hashmap.values()) {
	        System.out.println(name);
	    }
	    
	    Set<Map.Entry<Integer,String >> entries=hashmap.entrySet();
	    for(Map.Entry<Integer, String> entry : entries) {
	    	System.out.println((entry.getKey()+":"+entry.getValue()));
	    }
	    
	    Map<String,String> stringHash=new HashMap<>();
	    stringHash.put("mat", "1");
	    stringHash.put(new String("mat"), "3");
	    stringHash.put("mam", "2");
	    System.out.println("size: "+ stringHash.size());
	    System.out.println(stringHash);
	    
	   // hashmap.put(21.0, "value2"); /**The method put(Integer, String) in the type Map<Integer,String> is not applicable for the arguments (double, String)*/
	}
}
/*
	Remove the comments recompile and execute the program
*/

