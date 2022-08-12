package com.ex.streamfilters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx1 {
	public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "ravi");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"ravi".equals(line))     // we dont like ravi
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }
}
