package com.mphasis.arrays;

public class ArraysDemo {

	public static void main(String[] args) 
	{
		//syntax1
		
		int ar1[]= {101,102,103,104,105};
		//int[]
		//[]ar1
		//ar1[]
		//int[] a1,a2; both are arryas
		/*
		 * int arr[],x*/
		System.out.println(ar1.length);
		System.out.println(ar1);//hashcode
		System.out.println(ar1[0]);
		for (int i = 0; i < ar1.length; i++) 
		{
			System.out.println(ar1[i]);
			
		}
		
		//syntax2
		int ar2[]=new int [5];
		System.out.println(ar2.length);
		System.out.println(ar2);//hashcode
		ar2[0]=201;
		ar2[1]=202;
		ar2[2]=203;
		ar2[3]=204;
		for (int i = 0; i < ar2.length; i++)// normal for loop
		{
			System.out.println(ar2[i]);
			
		}
		for (int element : ar2)//for each with use arrays,collection
		{
			
			System.out.println(element);
		}

	}

}
