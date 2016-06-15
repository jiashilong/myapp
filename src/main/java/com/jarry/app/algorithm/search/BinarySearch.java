package com.jarry.app.algorithm.search;

import com.jarry.app.algorithm.sort.BubbleSort;

public class BinarySearch {
	
	public static int search(int[] a, int k) {
		int low = 0;
		int high = a.length - 1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(a[mid] == k) {return mid;}
			else if(a[mid] > k) {high = mid - 1;}
			else {low = mid + 1;}
		}
		
		return -1;
	}
	
	public static int search(int[] a, int low, int high, int k) {
		if(low <= high) {
			int mid = (low + high)/2;
			if(a[mid] == k) {return mid;} 
			else if(a[mid] > k) {return search(a, low, mid-1, k);} 
			else {return search(a, mid+1, high, k);}
		} 
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5};
		BubbleSort.sort(arr);
		System.out.println(search(arr, 4));
		System.out.println(search(arr, 0, arr.length-1, 4));
	}

}
