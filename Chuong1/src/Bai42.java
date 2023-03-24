package Chuong1.src;

import thuattoan.SMWI;
import thuattoan.isPrime;

import java.util.Random;

public class Bai42 {
    public int randomPrime() {
        Random random = new Random();
        isPrime isPrime = new isPrime();

        while (true) {
            int randomNum = random.nextInt(999)+1;
            if (isPrime.isPrime(randomNum)) return randomNum;
        }
    }

    public boolean Bai42(int a) {
        isPrime isPrime = new isPrime();
        SMWI smwi = new SMWI();

        int p = randomPrime();
        System.out.println("Số p = " + p);
        int q = randomPrime();
        System.out.println("Số q = " + q);

        int res = smwi.SMWI(a,p,q);
        if (isPrime.isPrime(res)) return true;
        return false;
    }
}
