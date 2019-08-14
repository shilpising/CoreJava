package javaBestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSort {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list=Arrays.asList("Alex", "Charles", "Brian", "David");
		System.out.println("Original String: "+list);
		//Using Collections.sort
		Collections.sort(list); //Natural Order
		System.out.println("Sorted list: "+list);

		//Reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reversed Sorted list: "+list);
		
		//Using list.sort
		list=Arrays.asList("shilpi", "Charles", "Atharva","Brian", "David");
		System.out.println("Original String: "+list);
		list.sort(Comparator.comparing(String::toString));
		System.out.println("Sorted list using Comparator.comparing: "+list);
		
		//Reverse order
		list.sort(Comparator.comparing(String::toString).reversed());
		System.out.println("Reversed Sorted list using Comparator.comparing: "+list);
		
		//Using Stream
		list=Arrays.asList("shilpi", "zzzzzzz", "Atharva","Brian", "David");
		System.out.println("Original String: "+list);
		List<String> sortedStr=list.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList());
		System.out.println("Sorted list using Stream: "+sortedStr);
		
		sortedStr=list.stream().sorted(Comparator.comparing(String::toString).reversed()).collect(Collectors.toList());
		System.out.println("Reversed Sorted list using Stream: "+sortedStr);
		
		//Sort arrayList of integers
		//Unsorted list
		List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2);
		
		System.out.println("Original integer list: "+numbers);
		numbers.sort(Comparator.comparing(Integer::valueOf));
		System.out.println("Sortedn integer list: "+numbers);
		
	}

}
