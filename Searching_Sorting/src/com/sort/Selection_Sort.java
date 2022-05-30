package com.sort;

import java.util.Scanner;

public class Selection_Sort {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=in.nextInt();
		in.nextLine();
		int a[]=new int[n];
		
		System.out.println("Enter the elements in an array");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
		
		
		//Selection sort logic
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				
				
				if(a[j]<a[min]) {
					min=j;
				}
				if(min!=i) {
					int temp=a[i];
					a[i]=a[min];
					a[min]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		in.close();
		
	}
}
