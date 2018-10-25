package loops.problemTwentyFour;

import java.util.Scanner;

public class ProblemTwentyFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int n = sc.nextInt();
		int i;

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		for (int k = n-1; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
