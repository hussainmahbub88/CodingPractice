package loops.problemTwentyNine;

public class ProblemTwentyNine {

	public static void main(String[] args) {
		for (int n = 13; n <= 2022; n++) {
			int temp = 0;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println("Prime numbers are :");
				System.out.println(n);
			}
		}

	}

}
