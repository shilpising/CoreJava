package javaBestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInsideList {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add(10);
		list.add("A");
		list.add(new ArrayList(Arrays.asList("b","c")));
		list.add(new ArrayList(Arrays.asList(40,9)));
		System.out.println(list);
		List<Object> ls=new ArrayList<>();
		for(Object o:list) {
			
			if(o.getClass()==ArrayList.class) {
				List<Object> temp=(ArrayList<Object>)o;
				temp.forEach(ls::add);
			}
			else {
				ls.add(o);
			}
			
		}
		System.out.println(ls);
		
		//You can use flatMap to flatten the internal lists (after converting them to Streams
		List<List<Object>> flatMap =new ArrayList<List<Object>>();
		flatMap.add(Arrays.asList(10));
		flatMap.add(Arrays.asList("A"));
		flatMap.add(Arrays.asList("b","c"));
		flatMap.add(Arrays.asList(40,9));
		System.out.println(flatMap);
		List<Object> flat = 
				flatMap.stream()
			        .flatMap(List::stream)
			        .collect(Collectors.toList());
		System.out.println(flat);

	}

}
