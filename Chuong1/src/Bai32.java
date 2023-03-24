package Chuong1.src;

import thuattoan.Eratosthenes;
import thuattoan.Euclide;
import thuattoan.SMWI;

import java.util.Random;

public class Bai32 {
    private int[] key() {
        Random random = new Random();
        Eratosthenes eratosthenes = new Eratosthenes();
        Euclide euclide = new Euclide();

        int[] key = new int[4];

        //Chọn ngẫu nhiên 2 số nguyên tố p,q
        int p,q;
        while (true) {
            p = random.nextInt(399)+101;
            q = random.nextInt(399)+101;
            if (eratosthenes.isPrime(p) && eratosthenes.isPrime(q)) break;
        }
        int n = p*q;
        int P = (p-1)*(q-1);

        //Chọn số nguyên tố e
        int e;
        while (true) {
            e = random.nextInt(P-1)+2;
            if (eratosthenes.isPrime(e)) break;
        }

        int[] arr = euclide.ExtendedEuclide(P,e);
        int d = arr[2];
        while (d <= 0) d += P;

        //public key
        key[0] = n;
        key[1] = e;
        //private key
        key[2] = n;
        key[3] = d;

        //Return key
        return key;
    }

    public int[] Encryption(int plainText) {
        SMWI smwi = new SMWI();

        int[] key = key();
        int m = plainText+123;
        int c = smwi.SMWI(m,key[1],key[0]);

        int[] key_Encrypt = new int[3];
        key_Encrypt[0] = key[2];
        key_Encrypt[1] = key[3];
        key_Encrypt[2] = c;

        return key_Encrypt;
    }

    public int Decryption(int[] cipherText) {
        SMWI smwi = new SMWI();

        int m = smwi.SMWI(cipherText[2], cipherText[1], cipherText[0]);
        return m-123;
    }
}
