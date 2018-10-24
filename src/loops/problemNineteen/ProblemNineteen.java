package loops.problemNineteen;

import java.util.Scanner;

public class ProblemNineteen {

	public static void main(String[] args) {
		/*
		 *  Given two integers, A and B, find A to the power B.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter both the integers here :");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		double result = Math.pow(A, B);
		System.out.println(result);
	}

}
