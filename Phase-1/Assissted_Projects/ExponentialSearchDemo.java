package com.mphasis.binary;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchDemo
{
	public static void main(String[] args)
	{
		int arr[]= {3,4,5,85,89,98};
		int length=arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key for binary search");
		int key = sc.nextInt();
		int outcome= exponentialSearch(arr, length, key);
		if(outcome<0) {
			System.out.println("element ot found");
		}
		else {
			System.out.println("element found at index "+outcome);
		}
	}
	public static int exponentialSearch(int arr[],int length,int key)
	{
		if(arr[0]==key){
            return 0;
            }
        int i=1;
        while(i<length && arr[i]<=key){

            i=i*2;
            break;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),key);
        

	}
}
