package com.search;


public class Exponential_Search {

	
	public static void main(String[] args) {
		int a[]= {1,5,7,8,12,14,15,16,160};
		
		int key=16;
		
		int k=exp_Search(a,key);
		System.out.println(k);
	}

	private static int exp_Search(int[] a, int key) {

		
		
		if(a[0]==key) {
			return 0;
		}
		int i=1;
		
		while(i<a.length&&a[i]<=key) {
			i*=2;
		}
		
		return bin_search(a,i/2,Math.min(i, a.length-1),key);
		
		
		
	}

	private static int bin_search(int[] a, int i, int high,int key) {

		int low=i;
		while(low<=high) {
			
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				return low;
			}
			
			if(key>a[mid]) {
				low=mid+1;
			}
			if(key<a[mid]) {
				high=mid-1;
			}
		}
		return -1;
	}
}
