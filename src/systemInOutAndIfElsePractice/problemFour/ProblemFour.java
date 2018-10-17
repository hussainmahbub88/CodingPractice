package systemInOutAndIfElsePractice.problemFour;

import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of a person in foot : ");
		double a = sc.nextDouble();

		double num = a * 30.48;
		System.out.println("The height of a person in centimeter is : " + num + " cm");

	}

}
