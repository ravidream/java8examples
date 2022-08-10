package com.ex.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndCollect {
	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("spring", "node", "mkyong");

	        List<String> result = lines.stream()                // convert list to stream
	                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	        result.forEach(System.out::println);                //output : spring, node

	    }
	 /*
	 
	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("spring", "node", "mkyong");
	        List<String> result = getFilterOutput(lines, "mkyong");
	        for (String temp : result) {
	            System.out.println(temp);    //output : spring, node
	        }

	    }

	    private static List<String> getFilterOutput(List<String> lines, String filter) {
	        List<String> result = new ArrayList<>();
	        for (String line : lines) {
	            if (!"mkyong".equals(line)) { // we dont like mkyong
	                result.add(line);
	            }
	        }
	        return result;
	    }*/
}
