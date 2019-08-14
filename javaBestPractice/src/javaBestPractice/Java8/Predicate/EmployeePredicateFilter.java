package javaBestPractice.Java8.Predicate;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicateFilter {

	public static Predicate<PredicateEmployee> isFemale(){
		return (a->a.getGender().equalsIgnoreCase("F"));
	}
	
	public static Predicate<PredicateEmployee> isAdultFemale(){
		Predicate<PredicateEmployee> female=a->a.getGender().equalsIgnoreCase("F");
		return ((Predicate<PredicateEmployee>)(a->a.getGender().equalsIgnoreCase("F"))).and(a->a.getAge()>=18);
	}
	
	public static Predicate<PredicateEmployee> isMale(){
		return (a->a.getGender().equalsIgnoreCase("M"));
	}
	
	public static Predicate<PredicateEmployee> isAdultMale(){
		return (((Predicate<PredicateEmployee>)(a->a.getGender().equalsIgnoreCase("M"))).and(a->a.getAge()>=18));
	}
	
	public static Predicate<PredicateEmployee> isAgeMoreThan(int age){
		return a->a.getAge()>age;
	}
	
	public static Predicate<PredicateEmployee> isAgeBetween(int age1,int age2){
		return ((Predicate<PredicateEmployee>)a->a.getAge()>=age1).and((Predicate<PredicateEmployee>)a->a.getAge()<age2);
	}
	public static List<PredicateEmployee>filter(List<PredicateEmployee> list,Predicate<PredicateEmployee> predicate){
		return list.stream().filter(predicate).collect(Collectors.<PredicateEmployee>toList());
	}
	
}
