package javaBestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeComparable implements Comparable{
	int id;
	String firstName;
	String lastName;
	
	public EmployeeComparable() {
		super();
	}

	public EmployeeComparable(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Object e) {
		EmployeeComparable tempObj=new EmployeeComparable();
		if(e instanceof EmployeeComparable) {
			tempObj=(EmployeeComparable)e;
			
		}
		return this.id - tempObj.id;
	}

	@Override
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName ;
    }
}

public class EmployeeComparableImpl {

	public static void main(String[] args) {
		EmployeeComparable e1 = new EmployeeComparable(1, "aTestName", "dLastName");
		EmployeeComparable e2 = new EmployeeComparable(2, "nTestName", "pLastName");
		EmployeeComparable e3 = new EmployeeComparable(3, "kTestName", "sLastName");
		EmployeeComparable e4 = new EmployeeComparable(4, "dTestName", "zLastName");
	 
	        List<EmployeeComparable> employees = new ArrayList<EmployeeComparable>();
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e1);
	        employees.add(e4);
	 
	        // UnSorted List
	        System.out.println(employees);
	 
	        Collections.sort(employees);
	 
	        // Default Sorting by employee id
	        System.out.println(employees);

	}

}
