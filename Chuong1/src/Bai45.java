package Chuong1.src;

import thuattoan.MillerRabin;

import java.util.Arrays;
import java.util.Random;

public class Bai45 {
    public int[] randomPrimeArray(int N, int a, int b) {
        Random random = new Random();
        MillerRabin mr = new MillerRabin();

        int[] A = new int[N];

        int k = 0;
        while (true) {
            if (k == N) break;
            int randomNumber = random.nextInt(b-a+1)+a;
            if (mr.MillerRabin(randomNumber, 10)) A[k++] = randomNumber;
        }
        return A;
    }

    public void Bai45(int N, int a, int b) {
        int[] A = randomPrimeArray(N, a, b);
        System.out.println("A = " + Arrays.toString(A));
        Arrays.sort(A);

        int minDistance = A[1] - A[0];
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] - A[j] >= 0 && A[i] - A[j] < minDistance) {
                    minDistance = A[i] - A[j];
                }
            }
        }
        System.out.println("Min Distance = " + minDistance);
    }
}
