package ineuron.ai.corejava.Strings;
//Anagram check
//Assumption:Strings must not contains # symbol in them
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2=sc.nextLine();
		str1=str1.replace(" ","");
		str2=str2.replace(" ","");
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("They are not considered as Anagram");
		}
		else {
			boolean flag=false;
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			for(int i=0;i<ch1.length;i++) {
				for(int j=0;j<ch2.length;j++) {
					if(ch1[i]==ch2[j]) {
						ch2[j]='#';
						break;
					}
				}
			}
			int count=0;
			for(char c:ch2) {
				if(c=='#') {
					count++;
				}
			}
			if(count==ch1.length) {
				System.out.println("They are anagrams");
			}
			else {
				System.out.println("They are not considered as anagrams");
			}
		}

	}

}
