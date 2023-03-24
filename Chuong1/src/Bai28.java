package Chuong1.src;

import thuattoan.Carmichael;

public class Bai28 {
    public void Bai28(int N) {
        Carmichael carmichael = new Carmichael();

        for (int i = 2; i <= N; i++) {
            if (carmichael.isCarmichael(i)) {
                System.out.println(i);
            }
        }
    }
}
