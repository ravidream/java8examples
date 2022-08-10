package com.ex.functional;

import java.util.ArrayList;
import java.util.List;
public class ForEachEx {
     public static void main(String[] args) {
        List<String> subList = new ArrayList<String>();
        subList.add("Carrot");
        subList.add("Potato");
        subList.add("Cauliflower");
        subList.add("LadyFinger");
        subList.add("Tomato");
        
        System.out.println("------------Vegetable List--------------");
        
        for(int i = 0; i < subList.size(); i++) {
        	System.out.println(subList.get(i));
        }
        System.out.println("--------------------------------------");
        
        for(String sub : subList) {
        	System.out.println(sub);
        }
        
        System.out.println("--------------------------------------");
        
        subList.forEach(sub -> {
        	System.out.println(sub);
        });
        
        
        System.out.println("--------------------------------------");
        
        subList.forEach(sub -> System.out.println(sub));
        
        System.out.println("--------------------------------------");
        
        subList.forEach(System.out::println);
  }
}

