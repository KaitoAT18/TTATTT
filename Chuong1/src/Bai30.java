package Chuong1.src;

import thuattoan.Carmichael;

public class Bai30 {
    public int Bai30(int N) {
        Carmichael carmichael = new Carmichael();

        int sum = 0;
        for (int i = 2; i <= N; i++) {
            if (carmichael.isCarmichael(i)) {
                sum+=i;
            }
        }
        return sum;
    }
}
