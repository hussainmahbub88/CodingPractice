package loops.problemTwenty;

import java.util.Scanner;

public class ProblemTwenty {

	/*
	 * Write a program to read in numbers until the number -999 is encountered. 
	 * The sum of all number read until -999 should be printed out
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		
		int sum = 0;
		for(int i = 0 ; i<= -999; i++) {
			int num = sc.nextInt();
			sum = sum + num;
			System.out.println(sum);
		}
		System.out.println("Sum of all the numbers are :" + sum);
	}

}
