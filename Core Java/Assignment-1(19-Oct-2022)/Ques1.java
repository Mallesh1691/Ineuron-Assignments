package ineuron.ai.corejava.patterns;

public class Ques1 {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<n;i++) {
			//letter I
			for(int j=0;j<n;j++) {
				if( i==0 || i== n-1 || j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter N
			for(int j=0;j<n;j++) {
				if( j==0 || i==j || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter E
			for(int j=0;j<n;j++) {
				if( j==0 || i==0 || i==n/2 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter U
			for(int j=0;j<n;j++) {
				if( j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter R
			for(int j=0;j<n;j++) {
				if( j==0 || (i==0 && j!=n-1) || (j==n-1 && i<n/2) || (i==n/2 && j<n-1) || (i==j && i>n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter O
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//letter N
			for(int j=0;j<n;j++) {
				if( j==0 || i==j || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
