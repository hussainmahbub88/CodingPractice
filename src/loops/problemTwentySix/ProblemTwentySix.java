package loops.problemTwentySix;

import java.util.Scanner;

public class ProblemTwentySix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {

			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();

			for (int space = n - i; space >= 0; space--) {
				System.out.print(" ");
			}
		}

	}

}
