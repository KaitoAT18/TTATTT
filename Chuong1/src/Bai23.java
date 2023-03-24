package Chuong1.src;

import thuattoan.isPrime;

public class Bai23 {
    public void Bai23(int A, int B) {
        isPrime isPrime = new isPrime();

        //Tính tổng các số nguyên tố trong khoảng [A,B]
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime.isPrime(i)) {
                sum += i;
            }
        }

        if (isPrime.isPrime(sum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
