package javaBestPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Dogg{
	int size;
	Dogg(int s){
		size=s;
	}
}

public class SetSample {

	public static void main(String[] args) {
		TreeSet<Integer> i=new TreeSet<Integer>();
		Set<Dogg> d=new HashSet<>();
		i.add(1);i.add(2);i.add(1);
		d.add(new Dogg(1));d.add(new Dogg(2));d.add(new Dogg(1));
		System.out.println(i.size()+""+d.size());
		
		List<String> arr=new ArrayList();
		arr.add("abc");
		arr.add("def");
		arr.add("ghi");
		arr.add(1,"jkl");
		arr.add(4,"sss");
		System.out.println(arr);
	}

}
