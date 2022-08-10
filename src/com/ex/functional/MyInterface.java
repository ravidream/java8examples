package com.ex.functional;

interface MyInterface {
     void testFunction(int x,int y);
 
     default void defaultFunction(){
         System.out.println("This is default method");
    }
}
