package systemInOutAndIfElsePractice.problemSeven;

import java.util.Scanner;
import java.util.*;
import java.text.*;

public class ProblemSeven {

	/*
	 * Given as input three integers representing a date as day, month, year, 
	 * print out the number day, month and year for the following day's date.
	 * Typical input: 28 2 1992 Typical output: Date following 28:02:1992 is 29:02:1992
	 */
	
	private static final DateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy");

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the day,month and year : ");
		int day = user_input.nextInt();
		int month = user_input.nextInt();
		int year = user_input.nextInt();

		

		Date currentDate = new Date();
		//System.out.println(dateFormat.format(currentDate));

		// convert date to calendar
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DAY_OF_MONTH, 1);

		
		// manipulate date
		//c.add(Calendar.YEAR, 1);
		//c.add(Calendar.MONTH, 1);
		//c.add(Calendar.DATE, 1); // same with c.add(Calendar.DAY_OF_MONTH, 1);
		//c.add(Calendar.HOUR, 1);
		//c.add(Calendar.MINUTE, 1);
		//c.add(Calendar.SECOND, 1);

		// convert calendar to date
		Date currentDatePlusOne = c.getTime();
		System.out.println("Date following "+dateFormat.format(currentDate)+" is "+dateFormat.format(currentDatePlusOne));

	}
}
