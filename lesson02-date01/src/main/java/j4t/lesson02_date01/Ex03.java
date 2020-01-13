package j4t.lesson02_date01;

	/* Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không */

public class Ex03 {
	
	public static void main(String[] args) {
		System.out.println(isSymmetricNumber(121));
	}

	public static boolean isSymmetricNumber(long n) {
		long reverse = 0, rem, temp;
		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		if (reverse == n) {
			return true;
		}
		return false;
	}

}
