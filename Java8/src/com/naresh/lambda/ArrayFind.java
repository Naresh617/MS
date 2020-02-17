package com.naresh.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*1. Given an integer array of size 2N+1 
In this given array ,N numbers are represented twice and 
once number represented only once in the array .


You need to find and return that number which is unique in the array
Time : O(n)
Space : O(1)


Ex: input N=7 [2,3,1,6,3,6,2]
out put : 1
*/

public class ArrayFind {

	public static void main(String[] args) {

		int a[] = { 2, 3, 1, 6, 3, 6, 2, 1, 5 };
		int result = formalApporachMethod(a);
		if (result == -1) {
			System.out.println("NO Unique Element Found");
		} else {
			System.out.println("Unique Element is Found \t" + result);
		}

		int result1 = hashMapApproachMethod(a);
		System.out.println("result1 value \t" + result1);
		
		int result2=XorApproachMethod(a);
		
		System.out.println("result2 value \t" + result2);
	}

	/*
	 * This Method take once sort the array it take n/2 iterations for find Unique
	 * elements Total time complexity O(n log(n + n/2) i.e O (n log(n)) This
	 * approach is not suited for requirements
	 */


	private static int formalApporachMethod(int[] a) {
		Arrays.sort(a);// First sort the array O(n log(n)) average time complexity.
		int count = 0;
		while (count < a.length) {
			if (a[count] != a[count + 1]) {
				return a[count];
			}
			count = count + 2;
		}
		return -1;
	}

	
	//above requirement this method is  correct Time Complexity O(n)  but here we  table  additional Hashmap  space complexity not satisfied O(n) 
	private static Integer hashMapApproachMethod(int[] a) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>(a.length);

		for (int num : a) {
			Integer occures = hmap.get(num);
			hmap.put(num, occures == null ? 1 : occures + 1);
		}
		for(Map.Entry<Integer, Integer> e: hmap.entrySet()) {
			if(e.getValue()==1)
			{
				return e.getKey();
			}
		}
		return -1;
	}
	
	
	//Above all requirements are satisfied 
	private static int XorApproachMethod(int[] a) {
		int result=0;
		
		for(int i=0;i<a.length;i++) {
			result ^= a[i];
		}
		return (result>0 ?result: -1);
		
	}

}
