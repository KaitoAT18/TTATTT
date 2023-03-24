package Chuong1.src;

import thuattoan.isPrime;

public class Bai13 {
    public void Bai13(int n) {
        isPrime isPrime = new isPrime();
        //Tìm tất cả các số nguyên liên tiếp nhỏ hơn hoặc bằng n rồi thêm vào 1 mảng
        int length = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime.isPrime(i)) {
                length++;
            }
        }

        int len = 0;
        int[] arr = new int[length];
        for (int i = 2; i <= n; i++) {
            if (isPrime.isPrime(i)) {
                arr[len] = i;
                len++;
            }
        }

        //Tính tổng hiệu hai số nguyên tố
        int sum = 0;
        int sub = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int m = 0;
            while (i-m > 0) {
                sum = arr[i+1] + arr[m];
                sub = arr[i+1] - arr[m];
                if (isPrime.isPrime(sum) && isPrime.isPrime(sub)) {
                    System.out.println("[" + arr[m] + ", " + arr[i+1] + "]");
                }
                m++;
            }
        }
    }
}
