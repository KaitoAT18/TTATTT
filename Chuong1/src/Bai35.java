package Chuong1.src;

import thuattoan.SMWI;

import java.util.Random;

public class Bai35 {
    private boolean MillerRabin(int n, int t) {
        Random random = new Random();
        SMWI smwi = new SMWI();
        //Step 1:
//        int temp = n;
//        temp-=1;
//        int r = n-1, s = 0;
//        while (temp % 2 == 0) {
//            r = temp/2;
//            s++;
//            temp/=2;
//        }
        int s = 0, r = (n-1)/(int)(Math.pow(2, s));
        while (r % 2 != 1) {
            s++;
            r = (n-1)/(int)(Math.pow(2, s));
        }
        //Step 2:
        int y = 0;
        int j;
        for (int i = 1; i <= t; i++) {
            int a = random.nextInt(n-2) + 2;
            System.out.println("Với a = " + a);
            y = smwi.SMWI(a, r, n);
            if (y != 1 && y != n-1) {
                j = 1;
                while (j <= s-1 && y != n-1) {
                    y = y*y % n;
                    if (y == 1) return false;
                    j++;
                }
                if (y != n-1) return false;
            }
        }
        //Step 3:
        return true;
    }

    public void Bai35(int n, int t) {
        if (MillerRabin(n,t)) {
            System.out.println("Số " + n + " là số nguyên tố");
        } else {
            System.out.println("Số " + n + " không phải là số nguyên tố");
        }
    }
}
