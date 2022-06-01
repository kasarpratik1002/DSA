package com.sort;
/*
 * Time complexity is O(n+k)
 * Space complexity is O(k)
 * where k is the size of temp array
 * 
 */
public class Counting_Sort {

	public static void main(String[] args) {
		
		int a[]= {4,4,3,3,3,3,2,1};
		counting_Sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void counting_Sort(int[] a) {

		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		//if array is 0 based indexing so create array of max+1
		int temp[]=new int[max+1];
		
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=0;
		}
		
		// taking count in temp array
		for (int i = 0; i < a.length; i++) {
			temp[a[i]]++;
		}

		int i = 0;
		int k = 0;

		while (i < temp.length) {
			if (temp[i] > 0) {
				a[k++] = i;// we need the index of temp array the value in temp array is count4
				temp[i]--;// reduce the count

			} else {
				i++;
				// increase the i only when temp[i] gets to 0
			}
		}

	}
	

}
