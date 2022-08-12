package com.ex.listtomap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapTest {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Anie", "120 South West"));
        list.add(new Employee(2, "Linda", "456 North Dakota"));
        list.add(new Employee(3, "Jake", "54 Avenue"));

        // key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println("Result 1 : " + result1);

        // key = name, value - websites
        Map<String, String> result2 = list.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getAdd));

        System.out.println("Result 2 : " + result2);

        // Same with result1, just different syntax
        // key = id, value = name
        Map<Integer, String> result3 = list.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));

        System.out.println("Result 3 : " + result3);
        
        Map<String, String> result4 = list.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getAdd));

        System.out.println("Result 4 : " + result4);
        
        
      //example 1 sort and collect
        Map result5 = list.stream()
                .sorted(Comparator.comparingInt(Employee::getId).reversed())
                .collect(
                        Collectors.toMap(
                        		Employee::getName, Employee::getAdd, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 5 : " + result5);
        
        
    }
}
