package com.ex.functional;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodReference {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(System.out::println);    
	}
}
