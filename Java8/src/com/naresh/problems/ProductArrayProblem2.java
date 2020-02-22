package com.naresh.problems;

import java.util.Arrays;

/*
Given an array of integers, return a new array such that each element
at index i of the new array is the product of all the numbers in the 
original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected
output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
/**
 * @author Naresh Reddy
 *
 */
public class ProductArrayProblem2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		findProductArrayElements(a);

	}

	private static void findProductArrayElements(int[] a) {
		int size=a.length;
		// TODO Auto-generated method stub
		
		int left[]=new int[size];
		int right[]=new int[size];
		int product[]=new int[size];
		
		left[0]=1;
	    right[size-1]=1;
	    
	    int i,j;
	    
	    for(i=1;i<size;i++) {
	    	left[i]=a[i-1]*left[i-1];
	    }
	    for(j=size-2;j>=0;j--) {
	    	right[j]=a[j+1]*right[j+1];
	    }
	    for(int k=0;k<size;k++) {
	    	product[k]=left[k]*right[k];
	    }
	    
	    System.out.println("Product Of Element In Given Array Fromat");
	    for(int result=0;result<product.length;result++) {
	    	System.out.print(product[result]+"\t");
	    }
	}
}
