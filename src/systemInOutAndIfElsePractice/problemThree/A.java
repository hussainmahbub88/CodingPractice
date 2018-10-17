package systemInOutAndIfElsePractice.problemThree;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of height : ");
		double height = sc.nextDouble();
		System.out.println("Enter the value of width : ");
		double width = sc.nextDouble();

		double area = height * width;
		System.out.println("Area of a rectangle is : " + area);

	}

}
