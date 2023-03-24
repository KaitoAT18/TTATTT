package Chuong1.src;

import thuattoan.isPrime;

public class Bai19 {
    public void Bai19(int A, int B, int C, int m, int l) {
        isPrime isPrime = new isPrime();

        System.out.print("x = ");
        int flag = 0;
        for (int i = m; i <= l; i++) {
            if ((A*i*i + B*i + C) >= 2) {
                if (isPrime.isPrime(A*i*i + B*i + C)) {
                    flag = 1;
                    System.out.println(i);
                }
            }
        }
        if (flag == 0) {
            System.out.println("Không tìm thấy x trong khoảng [" + m + "," + l + "]");
        }
    }
}
