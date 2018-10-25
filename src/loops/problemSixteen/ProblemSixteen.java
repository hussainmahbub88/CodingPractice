package loops.problemSixteen;

public class ProblemSixteen {
	/*
	 * Write a program to print all the numbers which are either multiples of 3 or
	 * multiples of 7, but not multiples of both, between 21 to 1944
	 */
	
	public static void main(String[] args) {

		for (int i = 21; i <= 1944; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			} else if (i % 3 == 0 && i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
