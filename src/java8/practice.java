package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class practice {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> result = numbers.stream().filter(e->e>=5).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> words = Arrays.asList("apple","banana","cherry","apple");
		List<String> res1 = words.stream().map(String :: toUpperCase).collect(Collectors.toList());
		List<String> res2 = words.stream().map(String :: toUpperCase).collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
		System.out.println(res1);
		System.out.println(res2);
		
		List<List<String>> lol = Arrays.asList(Arrays.asList("one","two"),Arrays.asList("three","four"));
		List<String> list = lol.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(list);
		
		List<String> res3 = words.stream().distinct().collect(Collectors.toList());
		System.out.println(res3);
		
		List<String> asc = words.stream().sorted().collect(Collectors.toList());
		List<String> desc = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(asc);
		System.out.println(desc);
		
		
	}
}
