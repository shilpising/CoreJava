package javaBestPractice.Java8.Predicate;

public class PredicateEmployee {
	private int id;
	private String fname;
	private String middle;
	private String lname;
	String gender;
	private int age;
	
	public PredicateEmployee(int id, int age, String gender, String fname , String lname ) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public void appendMiddle() {
		this.middle = "middle";
	}
	@Override
	public String toString() {
		return "PredicateEmployee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
}
