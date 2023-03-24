package Chuong1.src;

import thuattoan.isPrime;

public class Bai11 {
    public int Bai11(int N) {
        isPrime isPrime = new isPrime();

        //Tính tổng các số nguyên tố nhỏ hơn hoặc bằng N
        int sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime.isPrime(i)) sum+=i;
        }
        return sum;
    }
}
