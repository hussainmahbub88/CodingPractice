package loops.problemThirty;

public class ProblemB {
	/*
	 *  i = 5 j = 1   i = 5 j = 0   i = 5 j = -1  
 		i = 4 j = 1   i = 4 j = 0   i = 4 j = -1  
 		i = 3 j = 1   i = 3 j = 0   i = 3 j = -1  
	 */
	
	public static void main(String[] args) {
		int n = 5, i, j;
		for (i = 5; i >= 3; i--) {
			j = 1;
			while (j > -2) {
				System.out.print(" i = " + i + " j = " + j +"  ");
				j = j - 1;
			}
			System.out.println();
		}

	}

}
