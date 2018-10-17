package systemInOutAndIfElsePractice.problemTwo;

import java.util.Scanner;
import java.math.*;

public class ProblemTwo {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c = sc.nextDouble();
		
		double res = ((Math.pow(a, 3)+2*a*c-2)/(2*b*c-3))+((2*a)/(Math.pow(b,2)-a))+(5*a);
		System.out.println("The total result is : "+ res);
	}
}
