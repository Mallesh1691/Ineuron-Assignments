package ineuron.ai.corejava.Strings;
//to print duplicate characters from a string
//case insensitive
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Original String before printing duplicates");
		System.out.println(str1);
		String str2="";
		str1=str1.toLowerCase();//this line helps the program to be case insensitive
		char[] ch=str1.toCharArray();
		System.out.println("Duplicate characters in given String  are:");
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(i!=j && ch[i]==ch[j]) {
					String dup=""+ch[j];
					if(!(str2.contains(dup))) {
						str2+=dup;
						System.out.print(dup);
					}
				}
			}
		}
	}

}

