package javaBestPractice.Java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Account{
	private String name;
	private int balance;
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class StreamsIntroduction {

	public static void main(String[] args) {
		/*List<Account> list=new ArrayList<Account>();
		list.add(new Account("a",100));
		list.add(new Account("b",101));
		list.add(new Account("c",102));
		list.add(new Account("d",103));
		list.add(new Account("e",104));
		
		list.stream().forEach(acc -> System.out.println(acc.getName()+" "+acc.getBalance()) );
		
		Stream<Account> listFilter=list.stream().filter(a-> a.getBalance()>101);
		listFilter.forEach(acc -> System.out.println(acc.getName()+" "+acc.getBalance()) );
		
		System.out.println(listFilter.filter(a-> a.getBalance()>101));
		list.forEach(a -> System.out.println(a.getName()+" "+a.getBalance()));
		System.out.println();
		
		list.stream().map(a->a.getBalance()).forEach(b -> {System.out.format("%d\t",b);});//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		System.out.println();
		System.out.println();
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		Stream<Integer> square1 = number.stream().map(x->x*x);
		square.forEach(System.out::println);
		
		System.out.println();
		square1.forEach(System.out::println);
		
		//Generate Infinite Stream of Double in Java
		 DoubleStream        
         .iterate(0, i -> i + 1) // Iterate the DoubleStream with i          // by incrementing the value with 1 
         .forEach(System.out::println);         // Print the DoubleStream         // using forEach() method.  
		 
		String[] str=new String[] {"G", "e", "e", "k", "s", "F", "o", "r", "G", "e", "e", "k", "s"};
		// Iterate over the Stream with indices 
        IntStream  
            // Get the Stream from the array 
            .range(0, str.length)  
            // Map each elements of the stream 
            // with an index associated with it 
            .mapToObj(index -> String.format("%d -> %s",  index, str[index]))   
            // Print the elements with indices 
            .forEach(System.out::println); 
        
        //Flatten stream of array using forEach Loop
	     // Get the arrays to be flattened. 
	        Integer[][] arr = { 
	            { 1, 2 }, 
	            { 3, 4, 5, 6 }, 
	            { 7, 8, 9 } 
	        }; 
	        
	        List<Integer> slist=new ArrayList<Integer>();
	        for(Integer[] a:arr) {
	        	Arrays.stream(a).forEach(slist::add);
	        }
	        
	     // Print the flattened array 
	        System.out.println(Arrays.toString(slist.toArray())); */
		
		/*String[] str=new String[] {"G", "e", "e", "k", "s", "F", "o", "r", "G", "e", "e", "k", "s"};
		Arrays.asList(str).stream().filter
				(s->s.startsWith("G")).forEach(System.out::println);
		
		Predicate<String> p=Predicate.isEqual(Arrays.asList(str));
		Arrays.asList(str).stream().filter(p);
		System.out.println(Predicate.isEqual("abc").test("abc"));*/
		
		/*Stream.of("one", "two", "three", "four")
		  .filter(e -> e.length() > 3)
		 .peek(e -> System.out.println("Filtered value: " + e))
		  .map(String::toUpperCase).forEach(System.out::println);
		 // .peek(e -> System.out.println("Mapped value: " + e))
		  //.collect(Collectors.toList());
		
		Stream.of("one", "two", "three", "four")
		  .filter(e -> e.length() > 3)
		  .forEach(System.out::println);
		
		Stream.of("one", "two", "three", "four")
		  .peek(e->e.toUpperCase()).forEach(System.out::println);*/
		
		Stream.iterate(1, (Integer n) -> n + 1)
	      .peek(n -> System.out.println("number generated: - " + n))
	      .filter(n -> (n % 2 == 0))
	     // .peek(n -> System.out.println("Even number filter passed for - " + n))
	      .map(n->n+"ss").limit(5).forEach(System.out::println);
	      
	     // .count();
		
		Optional
	}

}
