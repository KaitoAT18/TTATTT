package Chuong1.src;

import thuattoan.BoyerMoore;

public class Bai36 {
    public void Bai36(String P, String T) {
        BoyerMoore bm = new BoyerMoore();

        //In ra bảng giá trị
        System.out.println("Bảng giá trị: ");
        bm.printL(P,T);

        //In ra kết quả sau khi chạy thuật toán
        System.out.println("Kết quả = " + bm.BoyerMoore(P,T));
    }
}
