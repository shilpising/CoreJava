package javaBestPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		String[] a = {"shilpi","singh","aviranjan","kumar"};
		List<String> list=Arrays.asList(a);
		List<String> subList=Arrays.asList("avi","ranjan");
		List<String> searchList=Arrays.asList("singh");
		System.out.println("Elements in list"+list);
		System.out.println("Elements in sublist"+subList);
		System.out.println("Elements in searchlist"+searchList);
		list.set(2, "singh");
		System.out.println("Elements in list"+list);
		Collections.copy(list, subList);
		System.out.println("Elements in list"+list);
		Collections.copy(list, subList);
		System.out.println("copy of sublist : " + subList + "and list " + list);
		
		// find and display maximum and minimum object value from list.
		System.out.println("object of maximum value--"+Collections.max(list));
		System.out.println("object of minimum value--"+Collections.min(list));
		
		// find and display index of first occurance of sublist in the list.
		System.out.println("first occurance of sublist in the list--"+Collections.indexOfSubList(list, searchList));
		
		// find and display index of last occurance of sublist in the list.
		System.out.println("last occurance of sublist in the list."+Collections.lastIndexOfSubList(list, searchList));
		
		// replace all objects in list by a new given object.
		System.out.println("replace all objects in list by a new given object.---"+Collections.replaceAll(list, "singh", "shilpi"));
		System.out.println("After replace--"+list);
		
		// list in reverse order.
		Collections.reverse(list);
		System.out.println("reverse list--"+list);
		
		// rotate the given number of objects in list,here 4
		Collections.rotate(list, 3);
		System.out.println("rotated list--"+list);
		
		// find size of the list
		System.out.println("size--"+list.size());
		
		/* Swap element in list. here swap specified element with
	    element at 0th(first) position */
		Collections.swap(list, 0, 2);
		System.out.println("swaped list--"+list);
		
		// Replace all the element with given element using fill()
		/*Collections.fill(list, "singh");
		System.out.println("new list--"+list);*/
		
		/* ncopies() returns immutable list consisting of copies
	    of the specified object. */
		List raviList = Collections.nCopies(5, subList);
        System.out.println("List created by ncopy() " + raviList);
        Collections.reverse(subList);
        System.out.println(" ncopies List in reverse order: " + raviList);
        System.out.println("subList in reverse order: " + subList);

        //Collection sort
        Collections.sort(list);
        System.out.println("new list--"+list);
        System.out.println("new list--"+list.get(1));
	}

}
