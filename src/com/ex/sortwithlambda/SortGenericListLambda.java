package com.ex.sortwithlambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortGenericListLambda {

	public static void main(String[] args) {

		List<Employee> listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		for (Employee developer : listDevs) {
			System.out.println(developer.getId());
		}
		
		System.out.println("After Sort");
		
		//lambda here!
		listDevs.sort((Employee o1, Employee o2)->o1.getId()-o2.getId());
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer.getId()));
	}

	private static List<Employee> getDevelopers() {

		List<Employee> result = new ArrayList<Employee>();

		result.add(new Employee(2, "John", "Add 1", new BigDecimal("70000")));
		result.add(new Employee(1, "alvin", "Add 1", new BigDecimal("80000")));
		result.add(new Employee(5, "jason", "Add 1", new BigDecimal("100000")));
		result.add(new Employee(3, "iris", "Add 1", new BigDecimal("170000")));
		
		return result;

	}
	
}
