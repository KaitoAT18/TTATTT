package Chuong1.src;

import thuattoan.GCD;
import thuattoan.isPrime;

public class Bai39 {
    public void Bai39(int[] A) {
        isPrime isPrime = new isPrime();
        GCD gcd = new GCD();

        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (isPrime.isPrime(gcd.GCD(A[i], A[j]))) {
                    System.out.println("[" + A[i] + ", " + A[j] + "]");
                }
            }
        }
    }
}
