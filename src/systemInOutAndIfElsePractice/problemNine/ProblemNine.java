package systemInOutAndIfElsePractice.problemNine;

import java.util.Scanner;

public class ProblemNine {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the 3 numbers : ");
		int a = user_input.nextInt();
		int b = user_input.nextInt();
		int c = user_input.nextInt();
		
		int result = 0;

		if (a < b && a < c && b < c) {
			result = a;
			System.out.println("First number is smallest = " + result);
		} else if (a < b && a < c && b > c) {
			result = a;
			System.out.println("First number is smallest = " + result);
		} else if (a > b && a < c && b < c) {
			result = b;
			System.out.println("Second number is smallest = " + result);
		} else if (a < b && b > c && c < a) {
			result = c;
			System.out.println("Third number is smallest = " + result);
		} else if (a > b && b < c && a > c) {
			result = b;
			System.out.println("Second is smallest = " + result);
		} else if (a > b && a > c && c < b) {
			result = c;
			System.out.println("Third is smallest = " + result);
		} else {
			System.out.println("Whoops not working !!!!!");
		}
	}

}
