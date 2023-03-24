package Chuong1.src;

import thuattoan.isPrime;

import java.util.Arrays;
import java.util.Random;

public class Bai16 {
    public void Bai16(int n) {
        isPrime isPrime = new isPrime();
        Random random = new Random();

        int[] arr = new int[n];

        //Sinh mảng ngẫu nhiên có n phần tử
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000)+1;
        }
        System.out.println(Arrays.toString(arr));
        int flag = 0;
        System.out.println("Số nguyên tố ngẫu nhiên trong mảng: ");
        //Kiểm tra số nguyên tố trong mảng vừa sinh
        for (int i = 0; i < arr.length; i++) {
            if (isPrime.isPrime(arr[i])) {
                flag = 1;
                System.out.println(arr[i]);
            }
        }
        if (flag == 0) {
            System.out.println("Không tìm thấy số nguyên tố trong mảng vừa sinh");
        }
    }
}
