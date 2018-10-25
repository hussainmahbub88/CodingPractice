package systemInOutAndIfElsePractice.problemFive;

import java.util.Scanner;

public class ProblemFive {

	/*
	 * Write a program to SWAP the values of two integers.
	 */

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the integer 1 value : ");
		int num1 = user_input.nextInt();
		System.out.println("Enter the integer 2 value : ");
		int num2 = user_input.nextInt();

		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Value of first integer is : " + num1);
		System.out.println("Value of second integer is : " + num2);
	}

}
