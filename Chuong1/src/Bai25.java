package Chuong1.src;

import thuattoan.Eratosthenes;

import java.util.Arrays;

public class Bai25 {
    private int[] findPrimeNumber(int N) {
        Eratosthenes e = new Eratosthenes();

        //Đếm các số nguyên tố nhỏ hơn hoặc bằng N
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (e.isPrime(i)) count++;
        }

        int[] primes = new int[count];
        //Gán các số nguyên tố nhỏ hơn hoặc bằng N vào mảng primes
        int k = 0;
        for (int i = 2; i <= N; i++) {
            if (e.isPrime(i)) primes[k++] = i;
        }
        return primes;
    }

    //Tìm M số nguyên tố có tổng = N
    private boolean findSum(int N, int M, int[] primes, int[] sum) {
        if (N == 0 && M == 0) {
            return true;
        } else if (N < 0 || M <= 0) {
            return false;
        } else {
            for (int i = 0; i < primes.length; i++) {
                sum[M-1] = primes[i];
                if (findSum(N-primes[i], M-1, primes, sum)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Bai25(int N, int M) {
        int[] primes = findPrimeNumber(N);
        int[] sum = new int[M];

        if (findSum(N, M, primes, sum)) {
            System.out.println(M + " số nguyên tố cần tìm là: ");
            Arrays.sort(sum);
            System.out.println(Arrays.toString(sum));
        } else {
            System.out.println("Không thể phân tích " + N + " thành tổng của " + M + " số nguyên tố");
        }
    }
}
