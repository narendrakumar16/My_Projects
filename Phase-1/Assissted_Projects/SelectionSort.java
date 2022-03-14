package com.mphais.sorting;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {5,2,48,8,55,22,96};
		int length=arr.length;
		selectionSort(arr);
		System.out.println("elements after sorting");
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}
	public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }


}
