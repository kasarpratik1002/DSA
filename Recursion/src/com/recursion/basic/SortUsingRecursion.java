package com.recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class SortUsingRecursion {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();

		lst.add(32);
		lst.add(22);
		lst.add(12);
		lst.add(2);
		lst.add(65);
		lst.add(11);

		sort(lst);

		lst.forEach(l -> System.out.println(l));
	}

	private static void sort(List<Integer> lst) {

		if (lst.size() == 1) {
			return;
		}
		int x = lst.remove(lst.size() - 1);

		sort(lst);

		insert(lst, x);

	}

	private static void insert(List<Integer> lst, int x) {
		if (lst.size() == 0 || lst.get(lst.size() - 1) <= x) {
			lst.add(x);
			return;
		}

		int temp = lst.remove(lst.size() - 1);
		insert(lst, x);
		lst.add(temp);
	}
}
