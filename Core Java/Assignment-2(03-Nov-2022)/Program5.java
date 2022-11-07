package ineuron.ai.corejava.ArraysSorting;
import java.util.*;
//Selection sort
public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(arr[min]>arr[j]) {
					min=j;
			}	
		}//swapping two elements
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
	}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
