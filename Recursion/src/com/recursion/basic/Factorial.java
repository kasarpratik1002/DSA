package com.recursion.basic;

public class Factorial {
	public static void main(String[] args) {

		int n=5;
		int fact=getFact(n);
		System.out.println(fact);
	}

	static int getFact(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*getFact(n-1);
		
	}
}
