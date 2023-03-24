package Chuong1.src;

import thuattoan.fN;

public class Bai22 {
    public int Bai22(int L, int R) {
        fN fn = new fN();

        int result = 0;
        for (int i = L; i < R; i++) {
            for (int j = i+1; j <= R; j++) {
                result += fn.fN(i) * fn.fN(j);
            }
        }
        return result;
    }
}
