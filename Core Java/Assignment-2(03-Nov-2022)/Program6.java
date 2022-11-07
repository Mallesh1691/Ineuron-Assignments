package ineuron.ai.corejava.ArraysSorting;
import java.util.*;
//To find whether an array is subset of other(elements need not be in same order)
//Assumption: we are checking whether 1st array is subset of 2nd array
public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  1st Array Size");
		int size1=sc.nextInt();
		System.out.println("Enter the  2nd Array Size");
		int size2=sc.nextInt();
		System.out.println("Enter  1st array elements");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter  2nd array elements");
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(arr1[i]==arr2[j]) {
					count+=1;
					break;
				}
			}
			
		}
		if(count==size1)
			System.out.println("Yes 1st array is subset of 2nd array");
		else
			System.out.println("No 1st array is not a subset of 2nd array");
			

	}

}
