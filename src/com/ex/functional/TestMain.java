package com.ex.functional;

class Main{
     public static void main(String args[]){
        //lambda expression
        MyInterface fobj = (int x, int y)->System.out.println(x+y);
 
        System.out.print("Result : ");
        fobj.testFunction(5,5);
        fobj.defaultFunction();
        
        fobj = (int x, int y)->System.out.println(x*y);
        
        System.out.print("Result : ");
        fobj.testFunction(5,5);
    }
}
