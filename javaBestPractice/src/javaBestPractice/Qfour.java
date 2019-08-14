package javaBestPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Qfour {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("A", "C");
		map.put("B", "C");
		map.put("C", "F");
		map.put("D", "E");
		map.put("E", "F");
		map.put("F", " F");

		getEmployPerMng(map);
	}

	public static void getEmployPerMng(Map<String, String> map){
		
		HashMap<String, List<String>> mapEmp = new HashMap<>();
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet){
			String emp = entry.getKey();
			String mng = entry.getValue();
			
			if (emp.equalsIgnoreCase(mng)) {
				continue;
			}
			
			if (mapEmp.containsKey(mng)) {
				mapEmp.get(mng).add(emp);
			}else{
				List<String> list = new ArrayList<>();
				list.add(emp);
				mapEmp.put(mng, list);
			}
		}
		
		
		
		for(String key: map.keySet()){
			
			if (mapEmp.get(key) != null) {
				System.out.println(key +" :" +getCount(mapEmp, mapEmp.get(key), 0) );
			}else{
				System.out.println(key +" "+ 0);
			}
		}
		
	}
	
	public static int getCount(HashMap<String, List<String>> map , List<String> list, int count){
		
		if (list == null) {
			return count;
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			List<String> childList = map.get(list.get(i));
			count = getCount(map, childList, count+1);
		}
		
		
		return count;
		
	}

}
