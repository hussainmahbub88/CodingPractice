package loops.problemThirtyOne;

public class ProblemThirtyOne {

	public static void main(String[] args) {
		int n = 3, i, j;
		for (i = -2; i < 1; i++) {
			for (j = n; j >= 1; j--) {
				System.out.print(" i= " + i + " j= " + j);
				System.out.println();
			}
			System.out.println("------------");
		}

	}

}
