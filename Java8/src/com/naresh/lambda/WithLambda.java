package com.naresh.lambda;

public class WithLambda {

	public static void main(String[] args) {
		int width = 20;

		Drawable d = () -> {
			System.out.println("Width" + width);
		};
		d.draw();
	}

}
