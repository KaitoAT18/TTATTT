package Chuong1.src;

import thuattoan.isPrime;

public class Bai14 {
    public void Bai14() {
        isPrime isPrime = new isPrime();

        //Tìm số nguyên tố có 3 chữ số
        int[] primeNum = new int[143];
        int len = 0;
        for (int i = 100; i < 1000; i++) {
            if (isPrime.isPrime(i)) {
                primeNum[len] = i;
                len++;
            }
        }

        //Đảo ngược số
        int[] newPrimeNum = new int[143];
        int lengthNew = 0;
        for (int i = 0; i < primeNum.length; i++) {
            int[] temp = new int[3];
            int length = 0;
            int temp1 = primeNum[i];
            while (temp1 > 0) {
                temp[length] = temp1 % 10;
                length++;
                temp1/=10;
            }
            int reversePrimeNum = 100*temp[0] + 10*temp[1] + temp[2];
            newPrimeNum[lengthNew] = reversePrimeNum;
            lengthNew++;
        }

        for (int i = 0; i < newPrimeNum.length; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((int)Math.pow(j, 3) == newPrimeNum[i]) {
                    System.out.println(primeNum[i]);
                }
            }
        }
    }
}
