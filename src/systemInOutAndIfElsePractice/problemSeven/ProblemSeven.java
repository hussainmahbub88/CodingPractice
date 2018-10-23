package systemInOutAndIfElsePractice.problemSeven;

import java.util.Scanner;
import java.util.*;
import java.text.*; 

public class ProblemSeven {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the day,month and year : ");
		int day = user_input.nextInt();
		int month = user_input.nextInt();
		int year = user_input.nextInt();

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));
		
		
	}
}
