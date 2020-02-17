package com.naresh.lambda;

@FunctionalInterface
public interface Interface2 {
	void print();
	
	default void display() {
		System.out.println("interface two display");
	}
	static void display1() {
		System.out.println("interface two  and display one");
	}

}
