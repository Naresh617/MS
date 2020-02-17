package com.naresh.lambda;

@FunctionalInterface
public interface Interface1 {
	void show();
	
	default void display() {
		System.out.println("interface one display");
	}
	static void display1() {
		System.out.println("interface one  and display one");
	}

}
