package Chuong1.src;

import thuattoan.isPrime;

public class Bai9 {
    public int Bai9(int N) {
        isPrime isPrime = new isPrime();

        //Đếm số nguyên tố
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (isPrime.isPrime(i)) count++;
        }
        return count;
    }
}
