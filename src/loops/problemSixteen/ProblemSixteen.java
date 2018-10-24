package loops.problemSixteen;

public class ProblemSixteen {

	public static void main(String[] args) {

		for (int i = 21; i <= 1944; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}else if (i % 3 == 0 && i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
