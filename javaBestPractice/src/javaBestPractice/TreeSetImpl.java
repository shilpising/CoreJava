package javaBestPractice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<>();
		set.add(80);
		set.add(0);
		set.add(-10);
		set.add(2);
		set.add(90);
		set.add(80);
		set.add(3);
		System.out.println(set.size());
		System.out.println(set);
	}

}
