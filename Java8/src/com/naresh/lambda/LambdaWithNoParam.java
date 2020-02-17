package com.naresh.lambda;

@FunctionalInterface
interface Sayable {
	public String say();
}
public class LambdaWithNoParam {
	public static void main(String[] args) {
		String Welcomemsg="Welcome to java 8 new Features";
		
		Sayable say=()->{return Welcomemsg;};
		System.out.println(say.say());
	}
}
