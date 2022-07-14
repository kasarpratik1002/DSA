package com.recursion.basic;

public class Pattern {

	public static void main(String[] args) {
		
		int n=5;
		printPattern(n);
	}

	private static void printPattern(int n) {

		if(n==0) {
			return;
		}
		printPattern(n-1);
		for(int i=0;i<n;i++) {
			System.out.print(n);
		}
		System.out.println();
		
	}
}
