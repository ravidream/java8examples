package com.ex.defaultandstatic;

public class TestClass implements TestInterface, TestInterface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		TestInterface.print("abc");
	}
	
}
