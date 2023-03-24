package Chuong1.src;

import thuattoan.CountPrime;
import thuattoan.isPrime;

public class Bai21 {
    public int Bai21(int A, int B) {
        isPrime isPrime = new isPrime();
        CountPrime countPrime = new CountPrime();

        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime.isPrime(i)) {
                if (isPrime.isPrime(countPrime.countPrime(i))) count++;
            }
        }
        return count;
    }
}
