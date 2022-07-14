package com.recursion.basic;

public class SumTest {

	public static void main(String[] args) {
		int n=5;
		int sum=getSum(n);
		System.out.println(sum);
	}
	static int getSum(int n) {
		
		if(n==1) {
			return 1;
		}
		int sum=n+getSum(n-1);
		return sum;
	}
}
