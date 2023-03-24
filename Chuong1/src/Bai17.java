package Chuong1.src;

import thuattoan.isPrime;

public class Bai17 {
    public int Bai17(int A, int B, int C) {
        isPrime isPrime = new isPrime();

        int i = 1;
        while (true) {
            if ((A*i*i + B*i + C) >= 2) {
                if (isPrime.isPrime(A*i*i + B*i + C)) return i;
            }
            i++;
        }
    }
}
