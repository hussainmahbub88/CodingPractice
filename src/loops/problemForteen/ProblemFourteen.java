package loops.problemForteen;

import java.util.Scanner;

public class ProblemFourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int sum = 0, max = 0, min = 0;

		for (int j = 1; j <= 10; j++) {
			
			int num = sc.nextInt();

			if (num <= min) {
				num = min;

			}else if (num >= max) {
				max = num;
			}
			sum = sum + num;
		}

		float avg = sum / 10;
		System.out.println("The minimum number is : " + min);
		System.out.println("The average is : " + avg);
		System.out.println("The maximum number is : " + max);

	}

}
