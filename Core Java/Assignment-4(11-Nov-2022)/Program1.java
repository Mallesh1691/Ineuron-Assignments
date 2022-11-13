package ineuron.ai.corejava.Strings;
//to remove duplicate characters from a string
//case insensitive
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Original String before removing duplicates");
		System.out.println(str1);
		str1=str1.toLowerCase();//this line helps the program to be case insensitive
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(i!=j && ch[i]==ch[j]) {
					ch[j]='#';
				}
			}
		}
		System.out.println(" String after removing duplicates");
		for(char c:ch) {
			if(c!='#')
				System.out.print(c);
		}

	}

}
