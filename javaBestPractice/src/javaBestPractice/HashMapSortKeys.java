package javaBestPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortKeys {
	 public static void main(String[] args) {
		 
		 HashMap<Integer,String> hmap=new  HashMap<Integer,String>();
		 hmap.put(85, "A");
         hmap.put(81, "C");
         hmap.put(41, "Z");
         hmap.put(77, "Y");

         System.out.println("Before Sorting by keys :");
         Set<Integer> set=hmap.keySet();
         Iterator<Integer> itr=set.iterator();
         while(itr.hasNext()) {
        	 Integer key=(Integer)itr.next();
			   System.out.print(key);
	           System.out.println(" - " + (String)hmap.get(key));
         }
         
         for(Map.Entry<Integer,String> entry:hmap.entrySet()){
        	 System.out.println("Key = " + entry.getKey() + 
                     ", Value = " + entry.getValue()); 
        	// hmap.remove(entry.getKey());
         }
         Map<Integer,String> m2=new TreeMap<Integer,String>(hmap);
         Set set2=m2.entrySet();
         Iterator iterator=set2.iterator();
         while(iterator.hasNext()) {
        	 Map.Entry me2 = (Map.Entry)iterator.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
             iterator.remove();
         }
         
         for(Map.Entry<Integer,String> entry:m2.entrySet()){
        	 System.out.println("Key = " + entry.getKey() + 
                     ", Value = " + entry.getValue()); 
        	// hmap.remove(entry.getKey());
         }
	 }

}
