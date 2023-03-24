package Chuong1.src;

import thuattoan.GCD;
import thuattoan.isPrime;

public class Bai27 {
    public void Bai27() {
        GCD gcd = new GCD();
        isPrime isPrime = new isPrime();

//        int length = 0;
//        for (int i = 2; i < 1000; i++) {
//            if (isPrime.isPrime(i)) length++;
//        }
//
//        int[] primes = new int[length];
//        int[] a = new int[999-length];
//        int k = 0, h = 0;
//        for (int i = 1; i < 1000; i++) {
//            if (isPrime.isPrime(i)) {
//                primes[k++] = i;
//                continue;
//            }
//            a[h++] = i;
//        }
//
//        for (int i = 0; i < primes.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (isPrime.isPrime(gcd.GCD(primes[i], a[j]))) System.out.println("[" + primes[i] + ", " + a[j] + "]");
//            }
//        }
        for (int i = 2; i < 999; i++) {
            for (int j = i+1; j < 1000; j++) {
                if (isPrime.isPrime(gcd.GCD(i,j))) System.out.println("[" + i + ", " + j + "]");
            }
        }
    }
}
