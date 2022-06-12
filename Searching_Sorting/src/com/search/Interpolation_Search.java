package com.search;
/*
 * 
 * Time complexity is O(1) if array is Uniformly distributed
 * other wise O(Logn) and space is O(1)
 */
public class Interpolation_Search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,9,12,14,15,16,17};
		int key=105;
		
		int low=0;
		int high=a.length-1;
		
		int k=inter_Search(a,low,high,key);
		System.out.println(k);
	}

	private static int inter_Search(int[] a, int low, int high, int key) {
		
		while(low<=high) {
			int pos=low+(int)((key-a[low])*(high-low)/(a[high]-a[low]));
			
			
			if(a[pos]==key) {
				return pos;
			}
			if(key<a[pos]) {
				high=pos-1;
			}
			if(key>a[pos]) {
				low=pos+1;
			}
		}
		
		return -1;
	}
}
