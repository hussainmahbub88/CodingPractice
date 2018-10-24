package loops.problemSixteen;
public class ProblemSixteen {

//	static int countMultiples(int n) {
//		int result = 0;
//		for (int i = 1; i <= n; i++) {
//			if (i % 3 == 0 || i % 7 == 0) {
//				result++;
//			}
//			
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		
//		System.out.print("Count = "); 
//	    System.out.println(countMultiples(25)); 
//
//	}

	public static void main(String[] args) {
		
		for (int i = 21; i <= 1944; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
