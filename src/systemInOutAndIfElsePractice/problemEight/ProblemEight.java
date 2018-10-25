package systemInOutAndIfElsePractice.problemEight;

import java.util.Scanner;

public class ProblemEight {

	/*
	 * Write a program which reads two integer values. If the first is less than the
	 * second, print the message “up”. If the second is less than the first, print
	 * the message “down” If the numbers are equal, print the message “equal”.
	 */

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the 1st integer value : ");
		int num1 = user_input.nextInt();
		System.out.println("Enter the 2nd integer value : ");
		int num2 = user_input.nextInt();

		if (num1 < num2) {
			System.out.println("up");
		} else if (num2 < num1) {
			System.out.println("down");
		} else if (num1 == num2) {
			System.out.println("equal");
		} else {
			System.out.println("Whoops !!!! It's not working !!!!!");
		}
	}

}
