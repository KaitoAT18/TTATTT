package Chuong1.src;

import thuattoan.isPrime;

public class Bai4 {
    public int countPrime(int A, int B) {
        isPrime isPrime = new isPrime();

        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime.isPrime(i)) count++;
        }
        return count;
    }
}
