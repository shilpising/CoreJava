package javaBestPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Employee{
	
	private int id;

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
public class HashingImpl {

	public static void main(String[] args) {
		System.out.println("HashingImpl hash code--"+ new HashingImpl().hashCode());
		
		HashSet empSet=new HashSet();;
		empSet.add(new Employee(100));
		empSet.add(new Employee(100));
		
		System.out.println("Employee list--"+empSet);
		System.out.println("Employee list--"+empSet.size());
		Employee obj1=new Employee(100);
		Employee obj3=new Employee(100);
		Object obj2=new Integer(131);
		Map<Object,String> map=new HashMap<>();
		map.put(obj1, "abc");
		map.put(obj2, "def");
		map.put(obj3, "ghi");
		System.out.println("map list--"+map.get(obj1));
		System.out.println("map list--"+map.get(obj2));
		System.out.println("map list--"+map.get(obj3));
		System.out.println("map list--"+map.size());
		System.out.println(obj1.hashCode()+"  "+obj2.hashCode()+"  "+obj3.hashCode());
		System.out.println((obj1==obj2)+" "+(obj1.equals(obj2)));
		System.out.println((obj1==obj3)+" "+(obj1.equals(obj3)));
		System.out.println((obj3==obj2)+" "+(obj3.equals(obj2)));
	}

}
