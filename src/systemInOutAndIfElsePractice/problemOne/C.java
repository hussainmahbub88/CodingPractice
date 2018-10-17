package systemInOutAndIfElsePractice.problemOne;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the integer value : ");
		int num = user_input.nextInt();
		System.out.println("Enter the character value : ");
		char c = user_input.next().charAt(0);
		System.out.println("Enter the float value : ");
		float floatValue = user_input.nextFloat();

		System.out.println("Integer Value is : " + num);
		System.out.println("Character Value is : " + c);
		System.out.println("Float value is : " + floatValue);
	}

}
