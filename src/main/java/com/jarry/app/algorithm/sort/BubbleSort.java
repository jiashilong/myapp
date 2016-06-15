package com.jarry.app.algorithm.sort;

public class BubbleSort {
	
	public static void sort(int[] a) {
		int len = a.length;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len-i-1; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	
	public static void sort2(int[] a) {
		int len = a.length;
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5};
		sort(arr);
		//System.out.println(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] arr2 = {1,3,4,2,5};
		sort2(arr2);
		//System.out.println(arr);
		for(int i : arr2) {
			System.out.print(i + " ");
		}
	}

}
