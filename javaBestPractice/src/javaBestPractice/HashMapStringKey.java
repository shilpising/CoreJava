package javaBestPractice;

import java.util.HashMap;

public class HashMapStringKey {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put(new String("one"), "3");
		System.out.println("Hash Map KeySet Size : " + map.keySet().size());
	}

}
