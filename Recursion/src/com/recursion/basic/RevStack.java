package com.recursion.basic;

import java.util.Stack;

public class RevStack {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		
		
		stack.push(12);
		stack.push(32);
		stack.push(54);
		reverse(stack);
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

	private static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int data=stack.pop();
		reverse(stack);
		insertlastElement(stack,data);
		
	}

	private static void insertlastElement(Stack<Integer> stack, int data) {
		
		
		if(stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp=stack.pop();
		
		insertlastElement(stack, data);
		
		stack.push(temp);
	}
}
