package com.recursion.basic;

public class NthFibonacci {

	public static void main(String[] args) {
		
		int n=7;
		int a =fibbo(n);
		System.out.println(a);
	}

	private static int fibbo(int n) {

		if(n<2) {
			return n;
		}
		int ans=fibbo(n-1)+fibbo(n-2);
		return ans;
	}
	
}
