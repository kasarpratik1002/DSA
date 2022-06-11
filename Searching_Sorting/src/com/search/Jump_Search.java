package com.search;
/*
 * Time complexity O(sqrt(n)) and time Complexity O(1)
 */
public class Jump_Search {

	
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,12,15,17,18,20};
		int key=-18;
		int m=(int)Math.floor(Math.sqrt(a.length));
		
		int k=jump_Search(a,m,key);
		System.out.println(k);
	}

	private static int jump_Search(int[] a, int m, int key) {
		int low=0;
		int high=a.length-1;
		int start=0;
		while(low<=high) {
			
			if(key==a[low]) {
				return low;
			}
			if(key<a[low]) {
				start=low-m;
			}
			if(key>a[low]) {
				start=low;
			}
			low+=m;
		}
		
		for(int i=start+1;i<start+m;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
