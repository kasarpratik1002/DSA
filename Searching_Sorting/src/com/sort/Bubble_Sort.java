package com.sort;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the size of an Array");
		int n = in.nextInt();
		in.nextLine();
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
		
		
		//Bubble Sort
		int temp;
		//passes are n-1 i.e. 5-1=4 0 1 2 3 
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
		
		
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
}
