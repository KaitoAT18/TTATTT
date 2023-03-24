package Chuong1.src;

import thuattoan.SMWI;
import thuattoan.isPrime;

import java.util.Random;

public class Bai43 {
    public void Bai43(int N) {
        Random random = new Random();
        isPrime isPrime = new isPrime();
        SMWI smwi = new SMWI();

        int p = 0;
        while (true) {
            p = random.nextInt(100);
            if (isPrime.isPrime(p)) break;
        }

        System.out.println("Với p = " + p + " thì: ");
        for (int i = 0; i < N; i++) {
            if (isPrime.isPrime(smwi.SMWI(i,p,N))) System.out.println("a = " + i + " là số nguyên tố");
        }
    }
}
