package com.recursion.basic;

import java.util.Stack;

public class MiddleElementStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(12);
		stack.push(32);
		stack.push(333);
		stack.push(65);
		stack.push(76);
		stack.push(128);
		int middle = getMiddle(stack, stack.size());
		System.out.println("Middle element got deleted " + middle);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static int getMiddle(Stack<Integer> stack, int size) {

		if (size % 2 == 0 && stack.size() == size / 2) {
			return stack.pop();
		}
		if (size % 2 == 1 && stack.size() == size / 2 + 1) {
			return stack.pop();
		}

		Integer pop = stack.pop();
		int middle = getMiddle(stack, size);
		stack.push(pop);
		return middle;
	}
}
