package javaBestPractice.Java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedStreamDemo {

	public static void main(String[] args) {
		
		/*//without boxing gives compilation error : Type mismatch: cannot convert from IntStream to List<Integer>
		List<Integer> i=IntStream.of(1,3,4,6,7,9,10);*/
		List<Integer> i=IntStream.of(1,3,4,6,7,9,10).boxed().collect(Collectors.toList());
		i.forEach(System.out::println);
	}

}
