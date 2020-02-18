package com.naresh.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author Naresh Reddy
 * 18/02/2020
 * problem 1
 */
/*
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 */
public class FindSumOfGivenList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,3,7);
		int sum=17;
		findTwoValuesSum(sum,list);
		Collections.sort(list);
		int start=0;
		int last=list.size()-1;
		Boolean b=findSum(sum,start,last,list);
		System.out.println(b);
	}
	private static void findTwoValuesSum(int sum, List<Integer> list) {
		int dummy;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<list.size();i++) {
			dummy=sum-list.get(i);
			if(set.contains(dummy)) {
				System.out.println("sum:: \t"+sum+"\t"+list.get(i)+"\t"+dummy);
			}
			set.add(list.get(i)); 
		}
		
	}
	private static Boolean findSum(int sum, int start, int last, List<Integer> list) {
		while(start<last) {
			if(list.get(start) +list.get(last) == sum) {
				return true;
			}else if(list.get(start) +list.get(last) < sum) {
				start++;
			}else {
				last--;
			}
		}
		return false;
	}

}
