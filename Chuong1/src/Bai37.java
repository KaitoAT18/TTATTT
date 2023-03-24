package Chuong1.src;

import thuattoan.KMP;

public class Bai37 {
    public void Bai37(String P, String T) {
        KMP kmp = new KMP();

        System.out.println("Kết quả = " + kmp.KMP(P,T));
    }
}
