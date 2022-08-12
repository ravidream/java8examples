package com.learnJava.functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample1 {
	static void ShowDetails(Map<Integer, String> map, String mapName) {
		System.out.println("----------" + mapName + " records-----------");
		map.forEach((key, val) -> System.out.println(key + " " + val));
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Mohan");
		map.put(110, "Sujeet");
		map.put(115, "Tom");
		map.put(120, "Danish");
		// Referring method
		BiConsumer<Map<Integer, String>, String> biCon = BiConsumerInterfaceExample1::ShowDetails;
		biCon.accept(map, "Student");
	}

}
