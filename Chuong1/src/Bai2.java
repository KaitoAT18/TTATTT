package Chuong1.src;

import thuattoan.isPrime;

public class Bai2 {
    public void findPrimeNumber(int n) {
        isPrime isPrime = new isPrime();

        int min = (int)Math.pow(10,n-1);
        int max = (int)Math.pow(10,n);

        for (int i = min; i <= max; i++) {
            if (isPrime.isPrime(i)) System.out.println(i);
        }
    }
}
