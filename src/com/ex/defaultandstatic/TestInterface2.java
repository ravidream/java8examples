package com.ex.defaultandstatic;

@FunctionalInterface
public interface TestInterface2
{

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}
