package com.sort;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		int n = in.nextInt();
		in.nextLine();

		int a[] = new int[n];

		System.out.println("Enter the elements in Array");

		for (int i = 0; i < n; i++) {

			a[i] = in.nextInt();
		}

		//Insertion Sort Logic
		int temp;
		for(int i=1;i<n;i++) {
			temp=a[i];
			
			int j=i-1;
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
}
