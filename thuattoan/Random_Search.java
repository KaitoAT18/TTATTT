package thuattoan;

import java.util.Random;

public class Random_Search {
    public int RandomSearch(int k, int t) {
        Random random = new Random();
        isPrime isPrime = new isPrime();
        MillerRabin mr = new MillerRabin();

        //Tìm các số nguyên tố trong khoảng từ 2 đến B
        int n = 0;
        int B = 1000;
        int len = 0;
        for (int i = 2; i <= B; i++) {
            if (isPrime.isPrime(i)) {
                len++;
            }
        }

        int[] primes = new int[len];
        int length = 0;
        for (int i = 2; i <= B; i++) {
            if (isPrime.isPrime(i)) {
                primes[length] = i;
                length++;
            }
        }

        boolean found = false;
        while (!found) {
            n = random.nextInt((int)Math.pow(2,k) - (int)Math.pow(2,k-1)+1) + (int)Math.pow(2,k-1);
            while (true) {
                for (int x: primes) {
                    if (n % x == 0) {
                        break;
                    }
                }
                if (mr.MillerRabin((int)n, t)) {
                    found = true;
                    break;
                }
            }
        }
        return n;
    }
}
