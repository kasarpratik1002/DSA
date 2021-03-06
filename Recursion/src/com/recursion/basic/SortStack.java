package com.recursion.basic;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(12);
		stack.push(32);
		stack.push(44);
		stack.push(1);
		stack.push(544);
		
		sortStack(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void sortStack(Stack<Integer> stack) {

		if(stack.size()==1) {
			return;
		}
		
		//hypo
		int x=stack.pop();
		
		sortStack(stack);
		
		pushStack(stack,x);
	}

	private static void pushStack(Stack<Integer> stack, int x) {

		if(stack.isEmpty()||stack.peek()>=x) {
			stack.push(x);
			return;
		}

		int temp=stack.pop();
		//hypo
		pushStack(stack, x);
		stack.push(temp);
		
	}
}
