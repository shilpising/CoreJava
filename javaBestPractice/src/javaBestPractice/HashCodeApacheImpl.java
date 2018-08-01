package javaBestPractice;

import java.util.HashSet;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
class ApacheEmployee{
	int id;
	String fname;
	public ApacheEmployee(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int hashCode() {
		final int PRIME=31;
		return new HashCodeBuilder(getId()%2==0?getId()+1:getId(),PRIME).hashCode();
	}
	
	public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		if(this==o) {
			return true;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		ApacheEmployee obj=(ApacheEmployee)o;
		System.out.println(new EqualsBuilder().append(getId(), obj.getId()).append(getFname(), obj.getFname()).isEquals());
		return new EqualsBuilder().append(getId(), obj.getId()).append(getFname(), obj.getFname()).isEquals();
	}
}
public class HashCodeApacheImpl {

	public static void main(String[] args) {
		HashSet empSet=new HashSet();
		empSet.add(new ApacheEmployee(100,"ss"));
		empSet.add(new ApacheEmployee(100,"ss"));
		
		System.out.println("Employee list--"+empSet);
		System.out.println("Employee list--"+empSet.size());
	}

}
