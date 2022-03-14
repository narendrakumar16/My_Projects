package com.mphasis.binary;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 8, 74, 6 };
		int length = arr.length;
		int start = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key for binary search");
		int key = sc.nextInt();
		binarySearch(arr, start, key, length);
       /* int index=Array.binarySearch(arr,key);
        System.out.println("Element  found at index "+index);
	*/}

	public static void binarySearch(int[] arr, int start, int key, int length) {

		int midValue = (start + length) / 2;
		while (start <= length) {

			if (arr[midValue] < key) {

				start = midValue + 1;
			} else if (arr[midValue] == key) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {

				length = midValue - 1;
			}
			midValue = (start + length) / 2;
		}
		if (start > length) {

			System.out.println("Element is not found");
		}

	}

}
