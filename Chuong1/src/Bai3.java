package Chuong1.src;

import thuattoan.isPrime;

public class Bai3 {
    public void Bai3(int N) {
        isPrime isPrime = new isPrime();

        //k: số ước nguyên tố của N
        //q: tổng của các ước nguyên tố của N
        //p: tổng của các ước số của N
        //s: số ước của N
        int k = 0, q = 0, s = 0, p = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                p+=i;
                s++;
                if (isPrime.isPrime(i)) {
                    q+=i;
                    k++;
                }
            }
        }
        //Tính: N+p+s-q-k
        System.out.println("Result = " + (N+p+s-q-k));
    }
}
