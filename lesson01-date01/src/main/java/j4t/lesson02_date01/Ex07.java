package j4t.lesson02_date01;

import java.util.Random;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		Random rd = new Random();
		Vector vector = new Vector();
        int num = 0;
        for (int i = 0; i < 5;  ) {
            num = 20+rd.nextInt(10);
            if (!vector.contains(num)){
                i++;
                vector.add(num);
                System.out.print(num+" ");
            }
        }
	}
	 
	}
