package com.sort;

public class Merge_Sort {

	public static void main(String[] args) {

		int a[] = {5,4,3,2,1,0};
		int low = 0;
		int high = a.length - 1;

		divide(a, low, high);

		for (int p = 0; p < a.length; p++) {
			System.out.println(a[p]);
		}

	}

	private static void divide(int[] a, int low, int high) {

		int mid;
		if (low < high) {
			mid = low + (high - low) / 2;

			divide(a, low, mid);
			divide(a, mid + 1, high);
			conquer(a, low, mid, high);

		}
		
	}
	//1. Create an array of high-low+1 size and then sort those elements there and copy to original array
	//2. Create two arrays of low-mid and mid+1 to high and then put in main array
	// Instead of creating two arrays we shall create 1 temporary array which will hold from si to ei
	private static void conquer(int[] a, int low, int mid, int high) {

		int merged[]=new int[high-low+1];
		
		int i=low;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=high) {
			if(a[i]<=a[j]) {
				merged[k++]=a[i++];
			}
			else {
				merged[k++]=a[j++];
				
			}
		}
		
		while(i<=mid) {
			merged[k++]=a[i++];
		}
		while(j<=high) {
			merged[k++]=a[j++];
		}
		
		for(int p=0,t=low;p<merged.length;p++,t++) {
			a[t]=merged[p];
		}
		
		
	}
}
