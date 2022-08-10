package com.ex.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachWithConsumer {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		
		list.forEach(new Consumer<String>() {       // anonymous class
		    @Override
		    public void accept(String str) {
		        System.out.println(str);
		    }
		});
	}
}
