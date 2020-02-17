package com.naresh.lambda;

import java.util.Scanner;

interface Hello{
	public String sayHello(String name);
}
public class LamdaWithSingleParam {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter a name");
		String msg=cin.next();
		Hello hello=(name)->{ return name;};
		System.out.println(hello.sayHello(msg));
	}
}
