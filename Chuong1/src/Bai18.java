package Chuong1.src;

import thuattoan.ArrayToInt;
import thuattoan.MultiprecisionAddition;

import java.util.Arrays;

public class Bai18 {
    public void Bai18(int a, int b, int w, int p) {
        MultiprecisionAddition ma = new MultiprecisionAddition();
        ArrayToInt ati = new ArrayToInt();

        int[] arr = ma.multiprecisionAddition(a,b,w,p);

        int[] c_arr = new int[arr.length-1];

        int k = 0;
        for (int i = 0; i < arr.length-1; i++) {
            c_arr[k++] = arr[i];
        }

        System.out.println("Tổng của 2 số " + a + " và " + b + " dưới dạng mảng là: ");
        System.out.println(Arrays.toString(c_arr));

        int c = ati.arrayToInt(p,w,c_arr);
        System.out.println("Tổng của 2 số " + a + " và " + b + " dưới dạng số nguyên là: " + c);
    }
}
