package systemInOutAndIfElsePractice.problemSeven;

import java.util.Scanner;
import java.util.*;
import java.text.*;

public class ProblemSeven {

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
