package ineuron.ai.corejava.Strings;
//to find if String contains all unique characters.
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		char[] ch=str1.toCharArray();
		boolean flag=false;
		label:for(int i=0;i<str1.length()-1;i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(ch[i]==ch[j]) {
					flag=true;
					break label;
				}
			}
		}
		if(flag){
			System.out.println("No it contains some dupllicate characters");
		}
		else {
			System.out.println("Yes the given string contains all unique characters");
		}

		

	}

}
