package systemInOutAndIfElsePractice.problemTwelve;

import java.util.Scanner;

public class ProblemTwelve {
	/*
	 * Given a number, if the number is divisible by 2, print “The number is
	 * divisible by 2”, if the number is divisible by 5, print “The number is
	 * divisible by 5”, if the number is divisible by BOTH 2 and 5, print “The
	 * number is divisible by both numbers”, if the number is not divisible by any
	 * of the given numbers, print “Not divisible by 2 or 5”
	 */

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = user_input.nextInt();

		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("The number is divisible by both numbers");
		} else if (num % 5 == 0) {
			System.out.println("The number is divisible by 5");
		} else if (num % 2 == 0) {
			System.out.println("The number is divisible by 2");
		} else {
			System.out.println("Not divisible by 2 or 5");
		}
	}

}
