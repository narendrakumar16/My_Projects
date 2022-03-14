package com.mphasis.linear;

import java.util.Scanner;

public class LinearSearchDemo 
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("enter key for linear search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int result=linearSearch(arr,key);
		if(result==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println(" element found at index  "+result);
		}
	}
	public static int linearSearch(int arr[],int key)
	{
		int len=arr.length;
		int index=-1;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==key)//if key found in given array
			{
				index=i;
				break;//index value will update
			}
			
		}
		return index;
	}

}
