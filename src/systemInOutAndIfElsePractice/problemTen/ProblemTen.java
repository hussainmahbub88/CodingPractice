package systemInOutAndIfElsePractice.problemTen;

import java.util.Scanner;

public class ProblemTen {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int a = user_input.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b = user_input.nextInt();
		System.out.println("Enter the 3rd number : ");
		int c = user_input.nextInt();
		System.out.println("Enter the 4th number :");
		int d = user_input.nextInt();

		int sum = 0;

		if (a < b && a < c && a < d) {
			sum = b + c + d;
			System.out.println("Sum of 3 large numbers are : " + sum);
		} else if (b < a && b < c && b < d) {
			sum = a + c + d;
			System.out.println("Sum of 3 large numbers are : " + sum);
		} else if (c < a && c < b && c < d) {
			sum = a + b + d;
			System.out.println("Sum of 3 large numbers are : " + sum);
		} else if (d < a && d < a && d < c) {
			sum = a + b + c;
			System.out.println("Sum of 3 large numbers are : " + sum);
		}

	}

}
