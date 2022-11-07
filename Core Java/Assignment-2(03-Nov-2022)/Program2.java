package ineuron.ai.corejava.ArraysSorting;
import java.util.*;
//Quicksort  
public class Program2 {
	
	void quick(int arr[], int begin, int end) 
	{  
	    if (begin < end)  
	    {  
	        int pivot = partitioningArray(arr, begin, end); 
	        quick(arr, begin, pivot - 1);  
	        quick(arr, pivot + 1, end);  
	    }  
	}
	int partitioningArray (int arr[], int begin, int end)  
	{  
	    int pivot = arr[end]; 
	    int i = (begin - 1);  
	  
	    for (int j = begin; j <= end - 1; j++)  
	    {  
	        if (arr[j] < pivot)  
	        {  
	            i++; 
	            int temp = arr[i];  
	            arr[i] = arr[j];  
	            arr[j] = temp;  
	        }  
	    }  
	    int temp = arr[i+1];  
	    arr[i+1] = arr[end];  
	    arr[end] = temp;  
	    return (i + 1);  
	} 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		} 
	    int begin=0;
	    int end=size-1;
	    Program2 quickObj = new Program2();  
	    quickObj.quick(arr, begin, end);  
	    System.out.println("After sorting array elements are");  
	    for (int i:arr) {
	    	System.out.print(i+" ");
	    }
	}

}
