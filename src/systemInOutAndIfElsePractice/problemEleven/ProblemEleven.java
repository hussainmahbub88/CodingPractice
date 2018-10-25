package systemInOutAndIfElsePractice.problemEleven;

import java.util.Scanner;

public class ProblemEleven {

	/*
	 * Given a number, if the number is divisible by 3 or 7,
	 *  print the message “The number is divisible by 3 or 7”, otherwise, 
	 *  print the message “The number is neither divisible by 3 nor by 7”.
	 */
	
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = user_input.nextInt();

		if (a % 3 == 0 || a % 7 == 0) {
			System.out.println("The number is divisible by 3 or 7");
		} else {
			System.out.println("The number is neither divisible by 3 nor by 7");
		}

	}

}
