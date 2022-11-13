package ineuron.ai.corejava.Strings;
//Pangram check
import java.util.*;

public class Program5 {

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
		boolean flag=false;
		for(int i:arr1) {
			if(i==0) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Not a pangram");
		else
			System.out.println("It is a pangram");
		
		
	}

}
