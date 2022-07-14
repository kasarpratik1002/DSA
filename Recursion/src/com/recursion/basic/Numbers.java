package com.recursion.basic;
//task is to print the numbers from n to 1
// i.e if n=5 then op= 5 4 3 2 1
public class Numbers {
	public static void main(String[] args) {
		int n=5;
		printNumber(n);
	}
	
	static void printNumber(int n) {
		
		//base condition which means where to stop
		if(n<1) {
			return;
		}
		//this is hypothesis means function call type
		printNumber(n-1);
		//this is induction which is nothing but work done
		System.out.println(n);
		
	}

}
