package javaBestPractice.Java8.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPredicateExample {

	public static void main(String[] args) {
		
	//Convert Regex to Predicate
		Predicate<String> emailFilter=Pattern.compile("^(.+)@example.com$").asPredicate();
		List<String> emails=Arrays.asList("alex@example.com", "bob@yahoo.com",
                "cat@google.com", "david@example.com");
		List<String> desired=emails.stream().filter(emailFilter).collect(Collectors.<String>toList());
		System.out.println("DEsired email"+ desired.toString()+"\n");
		// Now perform desired operation
		desired.forEach(System.out::println);
		
	//Using Regex using Pattern.matcher()
		Pattern pattern = Pattern.compile("^(.+)@example.com$");
	     
	    // Input list
	    List<String> emailss = Arrays.asList("alex@example.com", "bob@yahoo.com",
	                        "cat@google.com", "david@example.com");
	      
	    for(String email : emailss)
	    {
	        Matcher matcher = pattern.matcher(email);
	         
	        if(matcher.matches())
	        {
	            System.out.println(email);
	        }
	    }
	}

}
