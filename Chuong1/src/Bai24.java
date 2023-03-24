package Chuong1.src;

import thuattoan.isPrime;

public class Bai24 {
    public int Bai24(int a, int b) {
        isPrime isPrime = new isPrime();

        int count = 0;
        for (int i = 1; i < (int) Math.sqrt(b); i++) {
            for (int j = i+1; j <= (int) Math.sqrt(b); j++) {
                if (isPrime.isPrime(i*i + j*j)) {
                    if ((i*i + j*j) >= a && (i*i + j*j) <= b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
