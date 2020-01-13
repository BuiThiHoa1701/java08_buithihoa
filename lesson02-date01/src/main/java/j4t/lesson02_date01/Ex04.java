package j4t.lesson02_date01;

/*Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ
lớn nhất thứ hai trong dãy số và in ra.*/

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int[] a = oddNumberArr(arr);// {5,1,9,11,19,17,21}
		System.out.println("Mảng số lẻ sau khi sắp xếp:");
		sortASC(a);// {1,5,9,11,17,19,21}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Số lẻ lớn thứ 2 trong mảng:");
		System.out.println(a[a.length-2]);
	}

	public static int[] oddNumberArr(int[] arr) {
		int[] oddArray = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isOddNumber(arr[i])) {
				oddArray[index] = arr[i];
			} else {
				oddArray[index] = 0;
			}
			index += 1;
		}

		return oddArray;
	}

	public static boolean isOddNumber(int n) {
		if (n % 2 == 0) {
			return false;
		}
		return true;
	}

	public static void sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
