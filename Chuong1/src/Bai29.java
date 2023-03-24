package Chuong1.src;

import thuattoan.Carmichael;

public class Bai29 {
    public int Bai29(int N) {
        Carmichael carmichael = new Carmichael();

        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (carmichael.isCarmichael(i)) {
                count++;
            }
        }
        return count;
    }
}
