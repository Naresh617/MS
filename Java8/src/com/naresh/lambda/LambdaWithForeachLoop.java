package com.naresh.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForeachLoop {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();
		items.add("Naresh");
		items.add("Suresh");
		items.add("Ramesh");
		items.add("Raghu");

		items.forEach(s -> System.out.println(s));
	}

}
