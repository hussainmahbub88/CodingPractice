package loops.problemFifteen;

public class ProblemFifteen {
	/*
	 * Write a program to print all even numbers from 13 to 999
	 */
	
	public static void main(String[] args) {
		for (int i = 13; i <= 999; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
