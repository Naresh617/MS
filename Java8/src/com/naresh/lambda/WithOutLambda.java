package com.naresh.lambda;

interface Drawable{
	public void draw();
}

public class WithOutLambda {
	public static void main(String[] args) {
		int width=10;
		Drawable d=new Drawable() {
			@Override
			public void draw() {
				System.out.println("the Width is ::"+width);
				
			}
		};
		d.draw();
	}
}
