package j4t.lesson02_date01;
	/*
	 * Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình theo
	 * thứ tự tăng dần và chỉ dùng tối đa một biến phụ
	 */
public class Ex01 {
	
	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 2 };
		System.out.println("Mảng chưa sắp xếp:");
		printArr(array);
		System.out.println();
		sortASC(array);
		System.out.println("Mảng đã được sắp xếp:");
		printArr(array);
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

	public static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
