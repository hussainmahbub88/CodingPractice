package loops.problemForteen;

import java.util.Scanner;

public class ProblemFourteen {
	/*
	 * Write a program to read in 10 numbers and compute the average, maximum and minimum values
	 */ 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		double sum = 0, max = 0, min = sc.nextDouble();

		for (int j = 1; j <= 9; j++) {
			System.out.println("Enter the numbers :");
			double num = sc.nextDouble();

			if (num < min) {
				min = num;

			} else if (num > max) {
				max = num;
			}
			sum = sum + num;
		}

		double avg = sum / 10;
		System.out.println("The minimum number is : " + min);
		System.out.println("The average is : " + avg);
		System.out.println("The maximum number is : " + max);

		// Scanner in = new Scanner(System.in);
		// System.out.println("Enter numbers :");
		// double minimum = in.nextDouble();
		// while(in.hasNextDouble()) {
		// double input = in.nextDouble();
		// if(input < minimum) {
		// minimum = input;
		// }
		// }
		// System.out.println(minimum);
	}

}
