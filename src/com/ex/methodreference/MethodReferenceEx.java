package com.ex.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Jack", "Rose", "Jane", "Ruby");
		list.forEach(new Consumer<String>() {       // anonymous class
		    @Override
		    public void accept(String str) {
		        System.out.println(str);
		    }
		});


		list.forEach(str -> System.out.println(str)); // lambda
		

		list.forEach(System.out::println); 
		
		 list.forEach(new Consumer<String>() {
		        @Override
		        public void accept(String x) {
		            SimplePrinter.print(x);
		        }
		    });

		    // lambda expression
		    list.forEach(x -> SimplePrinter.print(x));

		    // method reference
		    list.forEach(SimplePrinter::print);
		    
		    List<String> list2 = Arrays.asList("1", "2", "3");

	        // anonymous class
	        List<Integer> collect1 = list2.stream()
	                .map(new Function<String, Integer>() {
	                    @Override
	                    public Integer apply(String s) {
	                        return Integer.parseInt(s);
	                    }
	                })
	                .collect(Collectors.toList());

	        // lambda expression
	        List<Integer> collect2 = list2.stream()
	                .map(s -> Integer.parseInt(s))
	                .collect(Collectors.toList());

	        // method reference
	        List<Integer> collect3 = list2.stream()
	                .map(Integer::parseInt)
	                .collect(Collectors.toList());
		    
	}


}

class SimplePrinter {
public static void print(String str) {
    System.out.println(str);
}
}


