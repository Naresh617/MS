package com.naresh.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>(20);// type safe
		al.add("suresh");
		System.out.println(al.isEmpty());//list is empty or not Checking
		System.out.println(al.size());
		
		//Arraylist adding elements
		
		List<Long> list =new ArrayList<Long>();
		list.add(10L);
		list.add(20L);
		list.add(30L);
		System.out.println(list);
		
		List<Integer> integer=new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(integer);
		
		
		List<Integer> list1 = new ArrayList<>(
				  IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new))
				);
		
		System.out.println(list1);
	}

}
