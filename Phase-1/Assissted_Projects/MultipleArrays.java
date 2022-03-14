package com.mphasis.arrays;

public class MultipleArrays {

	public static void main(String[] args)
	{
		//syntax1
		
	int[][] arr={
			{2,3},
			{3,4},
			{4,5}
			};
	System.out.println(arr);
	System.out.println(arr[0]);
	System.out.println(arr[1][1]);
	
	//syntax2 dynamic
	int[][] arr1=new int[3][];
			arr1[0]=new int[2];
			arr1[1]=new int[3];
			arr1[2]=new int[4];

	}

}
