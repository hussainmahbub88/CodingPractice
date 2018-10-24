package systemInOutAndIfElsePractice.problemThirteen;

import java.util.Scanner;

public class ProblemThirteen {

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
