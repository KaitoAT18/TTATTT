package Chuong1.src;

import thuattoan.isPrime;

public class Bai12 {
    public void Bai12(int n) {
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

        //Tính tổng 4 số nguyên tố liên tiếp rồi so sánh với n
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < length-3; i++) {
            sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
            if (sum <= n) {
                if (isPrime.isPrime(sum)) {
                    System.out.println("[" + arr[i] + ", " + arr[i + 1] + ", " + arr[i+2] + ", " + arr[i+3] + "]");
                    flag = 1;
                }
            }
        }

        if (flag == 0) {
            System.out.println("Không tìm thấy 4 số nguyên tố liên tiếp có tổng nhỏ hơn " + n);
        }
    }
}
