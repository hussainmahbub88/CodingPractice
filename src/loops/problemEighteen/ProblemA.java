package loops.problemEighteen;

import java.util.Scanner;

public class ProblemA {
	/*
	 * Write a program to find the Factorial of a given number
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int number = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
		
        /*
         * Formula to find factorial is 
         * n! = n * (n-1) * (n-2)*....*1
         */

	}

}
