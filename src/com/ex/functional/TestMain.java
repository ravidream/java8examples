package com.ex.functional;

class TestMain{
     public static void main(String args[]){
        //lambda expression
        MyInterface myInterface = (int x, int y) -> System.out.println(x+y);
 
        System.out.print("Result : ");
        myInterface.arithmeticFunction(5,5);
        myInterface.defaultFunction();
        
		
		myInterface = (int x, int y) -> System.out.println(x*y);
		  
		System.out.print("Result : "); myInterface.arithmeticFunction(5,5);
		 
    }
}
