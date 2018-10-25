package systemInOutAndIfElsePractice.problemThirteen;

import java.util.Scanner;

public class ProblemThirteen {
	/*
	 * Write a program, which will take MARK as input and show grade as output.
	 * Grading system: 80 or above A+ 70 or above A 60 or above A- Below 60 F
	 */

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = user_input.nextInt();

		if (marks >= 80) {
			System.out.println("Grade is A+");
		} else if (marks >= 70) {
			System.out.println("Grade is A");
		} else if (marks >= 60) {
			System.out.println("Grade is A-");
		} else if (marks < 60) {
			System.out.println("Grade is F");
		}
	}

}
