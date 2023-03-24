package Chuong1.src;

import thuattoan.isPrime;

public class Bai15 {
    public void Bai15(int n) {
        isPrime isPrime = new isPrime();

        //Đếm số phần tử trong mảng
        int length = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime.isPrime(i)) {
                length++;
            }
        }

        //Gán các số nguyên tố vào mảng
        int[] primeNumber = new int[length];
        int len = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime.isPrime(i)) {
                primeNumber[len] =  i;
                len++;
            }
        }

        //Kiểm tra
        for (int i = 0; i < primeNumber.length; i++) {
            for (int j = i+1; j < primeNumber.length-1; j++) {
                if (primeNumber[j] - primeNumber[i] == 2) {
                    //In ra kết quả
                    System.out.println("[" + primeNumber[i] + ", " + primeNumber[j] + "]");
                }
            }
        }
    }
}
