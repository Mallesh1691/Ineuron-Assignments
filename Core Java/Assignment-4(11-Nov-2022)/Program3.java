package ineuron.ai.corejava.Strings;
//to check 2552 is palindrome are not(commented code: using inbuilt methods)(uncommented code: without using inbuilt methods)
import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1="2552";
		/* Using Inbuilt methods
		 * StringBuilder sb1=new StringBuilder(str1); sb1.reverse();
		 * if(str1.equals(sb1.toString())) {
		 * System.out.println("The given string is a palindrome"); } else {
		 * System.out.println("The given string is not  a palindrome"); }
		 */
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("The given String is a palindrome");
		}
		else {
			System.out.println("The given String is not a palindrome");
		}
		
	}

}
