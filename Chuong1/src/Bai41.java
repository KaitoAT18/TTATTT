package Chuong1.src;

import thuattoan.SMWI;
import thuattoan.isPrime;

public class Bai41 {
    public boolean isPrime(int a, int k, int n) {
        SMWI smwi = new SMWI();
        isPrime isPrime = new isPrime();

        return isPrime.isPrime(smwi.SMWI(a, k, n));
    }
}
