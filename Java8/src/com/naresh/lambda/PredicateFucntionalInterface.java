package com.naresh.lambda;

import java.util.function.Predicate;

public class PredicateFucntionalInterface {
	public static void main(String[] args) {
		
		Predicate<Integer> pi1=i->(i>10);
		Predicate<Integer> pi2=i->(i<100);
		System.out.println(pi2.test(101));
		
		String[] name= {"Prasad","varma","kiran","ramu","Prabhu"};
		
		Predicate<String> statwith=s->s.charAt(0)=='P';
		System.out.println(statwith);
		
		for(String names:name)
		{
			if(statwith.test(names))
			{
				System.out.println(names);
			}
		}
	}

}
