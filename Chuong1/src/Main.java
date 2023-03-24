package Chuong1.src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bai33 bai33 = new Bai33();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập bậc của đa thức A: ");
        int n = input.nextInt();
        System.out.print("Nhập bậc của đa thức B: ");
        int m = input.nextInt();

        int[] a = new int[n+1];
        System.out.println("Nhập hệ số của A: ");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print("x^" + i + " = " );
            a[i] = input.nextInt();
        }
        int[] b = new int[m+1];
        System.out.println("Nhập hệ số của B: ");
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print("x^" + i + " = " );
            b[i] = input.nextInt();
        }

        int[] result = bai33.ExtendedEuclide(a,b);
        System.out.println("Result = " + Arrays.toString(result));
    }
}
