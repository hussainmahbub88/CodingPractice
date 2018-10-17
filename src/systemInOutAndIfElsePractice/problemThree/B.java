package systemInOutAndIfElsePractice.problemThree;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius : ");
		double radius = sc.nextDouble();

		double pie = 3.14159;
		double area = pie * Math.pow(radius, 2);
		System.out.println("Area of a circle is : " + area);

		double circumference = 2 * pie * radius;
		System.out.println("Circumference of a circle is : " + circumference);
	}

}
