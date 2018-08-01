package javaBestPractice;

import java.util.HashSet;

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
	}

}
