package j4t.lesson02_date01;

import java.util.ArrayList;
import java.util.List;

/*Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.*/

public class Ex06 {
	public static void main(String[] args) {
        int n = 200;
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        List<Integer> list = new ArrayList<Integer>();
        while (dem < n) {
            if (isPrime(i)) {
               list.add(i);
                dem++;
            }
            i++;
        }
        for (Integer integer : list) {
			System.out.print(integer+" ");
		}

        System.out.println();
        System.out.println("Số nguyên tố thứ 200 = "+list.get(199));
        
	}

	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				count +=1;
			}
		}
		if(count > 2) {
			return false;
		}
		return true;
	}
}
