package ineuron.ai.corejava.ArraysSorting;

import java.util.Scanner;

//Bubble sort
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			for(int j=1;j<size-i;j++) {
				if(arr[j-1]>arr[j]) {
					//Swapping using bitwise operator
					arr[j-1]=arr[j-1]^arr[j];
				    arr[j]=arr[j-1]^arr[j];
				    arr[j-1]=arr[j-1]^arr[j];
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
