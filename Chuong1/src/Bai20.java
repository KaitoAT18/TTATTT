package Chuong1.src;

import thuattoan.GCD;

public class Bai20 {
    public void Bai20(int M, int N, int D) {
        GCD gcd = new GCD();

        //Solution 1
//        if (M == 0) {
//            M = 1;
//        }
//        for (int i = M; i < N; i++) {
//            for (int j = i+1; j <= N; j++) {
//                if (gcd.GCD(i, j) == D) {
//                    System.out.println("[" + i + ", " + j + "]");
//                }
//            }
//        }

        //Solution 2
        int flag = 0;
        for (int i = D; i <= N; i += D) {
            for (int j = i + D; j <= N; j += D) {
                if (i >= M && j >= M) {
                    if (gcd.GCD(i, j) == D) {
                        flag = 1;
                        System.out.println("[" + i + ", " + j + "]");
                    }
                }
            }
            if (flag == 0) {
                System.out.println("Không tìm thấy");
            }
        }
    }
}
