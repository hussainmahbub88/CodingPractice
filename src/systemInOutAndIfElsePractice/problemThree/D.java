package systemInOutAndIfElsePractice.problemThree;

import java.util.Scanner;

public class D {
	/*
	 * Write a program to read a "float" representing a number of degrees Celsius, 
	 * and print as a "float" the equivalent temperature in degrees Fahrenheit. 
	 * Print your results in a form such as 100.0 degrees Celsius converts to 212.0 degrees Fahrenheit.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Celsius degrees : ");
		float a = sc.nextFloat();

		float Fahrenheit = (float) 1.8 * a + 32;
		System.out.println("Value in Fahrenheit is : "+ Fahrenheit + " degrees");
	}

}
