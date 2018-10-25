package loops.problemSeventeen;

import java.util.Scanner;

public class ProblemB {
	/*
	 * Write a program to reverse the digits of a given integer
	 */

	public static void main(String[] args) {
		int num = 0, reversenum = 0;

		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();

		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of input number is: " + reversenum);

	}

}
