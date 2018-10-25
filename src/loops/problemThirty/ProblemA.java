package loops.problemThirty;

public class ProblemA {
/*
 *  i = -1  j = 2
	i = -1  j = 3
	i =  0  j = 2
	i =  0  j = 3
	i =  1  j = 2
	i =  1  j = 3
 */
	public static void main(String[] args) {
		int n = 3, i, j;
		for (i = -1; i < 2; i++) {
			for (j = 2; j <= n; j = j + 1) {
				System.out.print("i = " + i + "  j = " + j);
				System.out.println();
			}
		}

	}

}
