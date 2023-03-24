package Chuong1.src;

import thuattoan.isPrime;

public class Bai10 {
    public void Bai10(int N) {
        isPrime isPrime = new isPrime();

        int count = 0;
        int count_Prime = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (isPrime.isPrime(i)) count_Prime++;
            }
        }
        System.out.println("Số ước của " + N + " là: " + count);
        System.out.println("Số ước nguyên tố của " + N + " là: " + count_Prime);
    }
}
