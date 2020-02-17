package com.naresh.lambda;

public class InterfaceImpl implements Interface1, Interface2 {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("Hello");
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		Interface1.super.display();
	}
	
	public static void main(String[] args) {
		Interface1.display1();
		Interface2.display1();
		
		InterfaceImpl imp=new InterfaceImpl();
		imp.show();
	}

}
