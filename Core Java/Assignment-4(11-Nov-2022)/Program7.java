package ineuron.ai.corejava.Strings;

import java.util.Arrays;
import java.util.Scanner;

//to find the maximum occurring character in a String.
public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		str1=str1.replace(" ","");
		str1=str1.toLowerCase();
		String str2="abcdefghijklmnopqrstuvwxyz";
		int[] arr1= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<str1.length();i++) {
			int index=str2.indexOf(str1.charAt(i));
			arr1[index]++;	
		}
		int max=arr1[0];
		int maxIndex=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
				maxIndex=i;
			}
		}
		System.out.println("The maximum frequecy character from the string is: "+ str2.charAt(maxIndex));
		

	}

}
