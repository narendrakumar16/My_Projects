package pack1;


	class NthSmallest 
	{ 
	int nthSmallest(int arr[], int a, int b, int c) 
	    	{ 
	             		if (c> 0 && c <= b - a+ 1) 
	        		{ 
	            			int pos = randomPartition(arr, a, b); 
	            			if (pos-a == c-1) 
	                			return arr[pos]; 
	            			if (pos-a > c-1) 
	                			return nthSmallest(arr, a, pos-1, c); 
	            			return nthSmallest(arr, pos+1, b, c-pos+a-1); 
	        		} 
	        return Integer.MAX_VALUE; 
	    } 
	    void swap(int arr[], int i, int j) 
	    { 
	        int temp = arr[i]; 
	        arr[i] = arr[j]; 
	        arr[j] = temp; 
	    } 
	    int partition(int arr[], int l, int r) 
	    { 
	        int x = arr[r], i = l; 
	        for (int j = l; j <= r - 1; j++) 
	        { 
	            if (arr[j] <= x) 
	            { 
	                swap(arr, i, j); 
	                i++; 
	            } 
	        } 
	        swap(arr, i, r); 
	        return i; 
	    } 
	    int randomPartition(int arr[], int l, int r) 
	    { 
	        int n = r-l+1; 
	        int pivot = (int)(Math.random()) * (n-1); 
	        swap(arr, l + pivot, r); 
	        return partition(arr, l, r); 
	    } 
	}  
	public class OrderStatisticsDemo
	{
		public static void main(String[] args) {
			NthSmallest ob = new NthSmallest(); 
	        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
	        int n = arr.length,c = 4; 
	        System.out.println("N'th Smallest Element is "+ ob.nthSmallest(arr, 0, n-1, c)); 
	    }
	}


