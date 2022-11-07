package ineuron.ai.corejava.ArraysSorting;
import java.util.*;
//Merge sort
 public class Program4 {  
	 
void mergeSort(int arr[], int begin, int end)  
	 {  
	     if (begin < end)   
	     {  
	         int mid = (begin + end) / 2;  
	         mergeSort(arr, begin, mid);  
	         mergeSort(arr, mid + 1, end);  
	         merge(arr, begin, mid, end);  
	     }  
	 } 
void merge(int arr[], int begin, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - begin + 1;    
    int n2 = end - mid;    
        int[] leftArray = new int[n1];  
        int[] rightArray = new int[n2];  
      
    for (i = 0; i < n1; i++)    
    leftArray[i] = arr[begin + i];    
    for (j = 0; j < n2; j++)    
    rightArray[j] = arr[mid + 1 + j];    
      
    i = 0;  
    j = 0;   
    k = begin;   
      
    while (i < n1 && j < n2)    
    {    
        if(leftArray[i] <= rightArray[j])    
        {    
            arr[k] = leftArray[i];    
            i++;    
        }    
        else    
        {    
            arr[k] = rightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        arr[k] = leftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        arr[k] = rightArray[j];    
        j++;    
        k++;    
    }    
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
		    Program4 mergeObj = new Program4();  
		    mergeObj.mergeSort(arr, begin, end);  
		    System.out.println("After sorting array elements are ");  
		    for(int i:arr) {
		    	System.out.print(i+" ");
		    }  
		}  

	}
