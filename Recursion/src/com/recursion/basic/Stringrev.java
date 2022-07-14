package com.recursion.basic;

public class Stringrev {

	public static void main(String[] args) {
		
		String str="pratik";
		String rev=reverse(str);
		System.out.println(rev);
	}

	private static String reverse(String str) {
		
		
		if(str.isEmpty()) {
			return str;
		}
		String c=str.charAt(0)+"";
		
		String reverse = reverse(str.substring(1));
		return reverse+c;
	}
}
