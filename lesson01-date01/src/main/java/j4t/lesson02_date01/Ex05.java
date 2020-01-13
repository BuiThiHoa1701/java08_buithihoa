package j4t.lesson02_date01;

/*Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ
cơ số 2*/

public class Ex05 {
	public static void main(String[] args) {
		int n = 125;
		doiCoSo(n, 2);
		System.out.println(n);
	}

	public static void doiCoSo(int n, int base) {
		if (n >= base)
			doiCoSo(n / base, base);
		if (n % base > 9)
			System.out.printf("%c", n % base + 55);
		else
			System.out.print((n % base));
	}
}
