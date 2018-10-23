package systemInOutAndIfElsePractice.problemTwelve;

import java.util.Scanner;

public class ProblemTwelve {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = user_input.nextInt();

		if(num % 2 == 0 && num % 5 == 0) {
			System.out.println("The number is divisible by both numbers");
		}else if (num % 5 == 0 ) {
			System.out.println("The number is divisible by 5");
		}else if(num % 2 == 0 ) {
			System.out.println("The number is divisible by 2");
		}else {
			System.out.println("Not divisible by 2 or 5");
		}
	}

}
