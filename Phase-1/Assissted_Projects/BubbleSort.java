package com.mphais.sorting;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int arr[]= {2,7,5,66,10,22,65,25,};
		bubbleSort(arr);
		System.out.println("elements After sorting");
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
		
	}
	   public static void bubbleSort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;

	                }


	            }
	        }
	   }


}
