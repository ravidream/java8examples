package com.ex.foreach;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForEachEx {

	public static void main(String[] args) {
		//creating sample Collection int list
		List<Integer> myList = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Value of i : " + i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Anonymous class value : " + t);
			}
		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
		MyConsumer2 action2 = new MyConsumer2();
		myList.forEach(action2);
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value : " + t);
	}
}


//Consumer implementation that can be reused
class MyConsumer2 implements Consumer<Integer>{

	public void accept(Integer t) {
		t = t * 10;
		System.out.println("Consumer Value * 10 : " + t );
	}
}