package Chuong1.src;

import thuattoan.FindPrimeNumNearest;
import thuattoan.SMWI;

public class Bai31 {
    public void Bai31(int studentCode) {
        //Sử dụng thuật toán nhân bình phương có lặp
        FindPrimeNumNearest nearest = new FindPrimeNumNearest();
        SMWI smwi = new SMWI();

        int k = nearest.NearestNum(studentCode);
        System.out.println("k = " + k);
        System.out.println(smwi.SMWI(studentCode, k, 123456));
    }
}
