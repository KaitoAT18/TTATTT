package Chuong1.src;

import thuattoan.isPrime;

public class Bai26 {
    public void Bai26(int N) {
        isPrime isPrime = new isPrime();

        for (int i = 4; i < N; i++) {
            for (int j = 2; j < Math.sqrt(N); j++) {
                if (isPrime.isPrime(j)) {
                    if (i % j == 0 && i % (j*j) == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
