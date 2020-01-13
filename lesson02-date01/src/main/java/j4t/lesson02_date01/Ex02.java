package j4t.lesson02_date01;

	/* Viết chương trình tính tổng S = 4! +7! + 12! + 18! */

public class Ex02 {
	
	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println(sum);
	}

	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
