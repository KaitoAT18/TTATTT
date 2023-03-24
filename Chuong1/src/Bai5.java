package Chuong1.src;

import thuattoan.isPrime;

public class Bai5 {
    public int PrimeSum(int A, int B) {
        isPrime isPrime = new isPrime();

        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime.isPrime(i)) sum+=i;
        }
        return sum;
    }
}
