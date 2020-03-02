package com.naresh.problems;

import java.util.Scanner;

public class OderElements 
{
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the n values");
		int n=cin.nextInt();
		int a[]=findEvenOddNumbers(n);
		for(int i=1;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}

	private static int[] findEvenOddNumbers(int n) {
		
		int b[] =new int[n+1];
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				b[i]=i;
			}
			else {
				b[i]=i;
			}
		}
		return b;
	}

}
