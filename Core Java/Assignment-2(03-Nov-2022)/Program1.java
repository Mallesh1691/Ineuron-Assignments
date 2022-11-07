package ineuron.ai.corejava.ArraysSorting;

import java.util.Scanner;

//To find duplicates present in an Array
//Assumption: Array must not contain -1 as an element

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		boolean value=false;
		System.out.println("The duplicate elements in the array are:");
		for(int i=0;i<size;i++) {
			value=false;
			for(int j=0;j<size;j++) {
				if(i!=j && arr[i]==arr[j] && arr[j]!=-1) {
					arr[j]=-1;
					value=true;
				}
			}
			if(value) {
			System.out.println(arr[i]);
			}
		}
		
	}
	
}
