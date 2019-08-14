package javaBestPractice.Java8.Predicate;


 import static javaBestPractice.Java8.Predicate.EmployeePredicateFilter.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class TestEmployeePredicates {

	public static void main(String[] args) {
		PredicateEmployee e1 = new PredicateEmployee(1,23,"M","Rick","Beethovan");
        PredicateEmployee e2 = new PredicateEmployee(2,13,"F","Martina","Hengis");
        PredicateEmployee e3 = new PredicateEmployee(3,43,"M","Ricky","Martin");
        PredicateEmployee e4 = new PredicateEmployee(4,26,"M","Jon","Lowman");
        PredicateEmployee e5 = new PredicateEmployee(5,13,"F","Cristine","Maria");
        PredicateEmployee e6 = new PredicateEmployee(6,15,"M","David","Feezor");
        PredicateEmployee e7 = new PredicateEmployee(7,68,"F","Melissa","Roy");
        PredicateEmployee e8 = new PredicateEmployee(8,79,"M","Alex","Gussin");
        PredicateEmployee e9 = new PredicateEmployee(9,15,"F","Neetu","Singh");
        PredicateEmployee e10 = new PredicateEmployee(10,45,"M","Naveen","Jain");
         
        List<PredicateEmployee> PredicateEmployees = new ArrayList<PredicateEmployee>();
        PredicateEmployees.addAll(Arrays.asList(new PredicateEmployee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
      
         filter(PredicateEmployees,isFemale()).forEach(System.out::print);
         System.out.println("\n-------------");
        
        System.out.println(filter(PredicateEmployees,isAdultFemale()));
        System.out.println(filter(PredicateEmployees,isMale()));
        System.out.println(filter(PredicateEmployees,isAdultMale()));
        System.out.println(filter(PredicateEmployees,isAgeMoreThan(35)));
        
        //check the abstract test method of PredicateInterface
        System.out.println(isAdultFemale().test(e1));
        System.out.println(isAdultFemale().test(e7));
        
        
        //map implementation
        PredicateEmployees.stream().map(PredicateEmployee::getAge).forEach(b -> {System.out.format("%d\t",b);});;
      //map implementation
        System.out.println(PredicateEmployees.stream().map(PredicateEmployee::getAge).distinct().collect(Collectors.toList()));
        
      //using-comparator-becomes-easier-with-lambda-expressions-java-8
        List<PredicateEmployee> employees  = new ArrayList<>();
        employees.add(new PredicateEmployee(6, 25,"M","Yash", "Chopra"));
        employees.add(new PredicateEmployee(2, 28,"M","Aman", "Sharma"));
        employees.add(new PredicateEmployee(3, 52,"M","Aakash", "Yaadav"));
        employees.add(new PredicateEmployee(5, 19,"M","David", "Kameron"));
        employees.add(new PredicateEmployee(4, 72,"M","James", "Hedge"));
        employees.add(new PredicateEmployee(8, 88,"M","Balaji", "Subbu"));
        employees.add(new PredicateEmployee(7, 59,"M","Karan", "Johar"));
        employees.add(new PredicateEmployee(1, 32,"M","Lokesh", "Gupta"));
        employees.add(new PredicateEmployee(9, 33,"M","Vishu", "Bissi"));
        employees.add(new PredicateEmployee(10, 60,"M","Lokesh", "Ramachandran"));
        
        	//Sort by id
        	Collections.sort(employees, Comparator.comparing(e->e.getId())); //or use the below
        	Collections.sort(employees,Comparator.comparing(PredicateEmployee::getId));//using method reference
        	System.out.println("*******");
        	System.out.println(employees);
        	
        	//Sort by first name
        	employees.sort(Comparator.comparing(PredicateEmployee::getFname));
        	System.out.println(employees);
        	
        	//reverse order
        	employees.sort(Comparator.comparing(PredicateEmployee::getFname).reversed());
        	System.out.println(employees);
        
	}

}
