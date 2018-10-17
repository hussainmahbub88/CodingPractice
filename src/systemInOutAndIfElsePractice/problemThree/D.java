package systemInOutAndIfElsePractice.problemThree;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Celsius degrees : ");
		float a = sc.nextFloat();

		float Fahrenheit = (float) 1.8 * a + 32;
		System.out.println("Value in Fahrenheit is : "+ Fahrenheit + " degrees");
	}

}
