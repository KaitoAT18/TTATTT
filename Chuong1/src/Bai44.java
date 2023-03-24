package Chuong1.src;

import thuattoan.InversionInFp;

import java.util.Arrays;

public class Bai44 {
    public void Bai44(int[] A, int p) {
        InversionInFp inversion = new InversionInFp();

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = inversion.inversionInFp(p, A[i]);
        }

        System.out.println(Arrays.toString(B));
    }
}
