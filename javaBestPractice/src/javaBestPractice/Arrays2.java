package javaBestPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Arrays2 {

	public static void main(String[] args) {
		Integer[] array1 ={1,2,3,4,5,6,7,8,9,5};
		Integer[] array2 ={3,1,2,4,5,6,7,8};
		List<Integer> list1=Arrays.asList(array1);
		List<Integer> list2=Arrays.asList(array2);
		Arrays.sort(array1);
		List<Integer> list3=Arrays.asList(array1);
		Iterator<Integer> itr = list3.iterator();
		while(itr.hasNext()) {
			Integer o=(Integer)itr.next();
			System.out.println("List3--"+o);
		}
		Set<Integer> set1= new HashSet<Integer>(list1);
		set1.removeAll(list2);
		itr=set1.iterator();
		while(itr.hasNext()) {
			Integer o=(Integer)itr.next();
			System.out.println(("Set1"+o));
		}
	}

}
