package Chuong1.src;

import thuattoan.isPrime;

public class Bai7 {
    public boolean isEmirp(int n) {
        isPrime isPrime = new isPrime();

        if (!isPrime.isPrime(n)) return false;
        //Convert int to String
        String n_str = n + "";
        //Reverse n_str
        StringBuffer sb = new StringBuffer(n_str);
        String n_strRev = sb.reverse() + "";
        int n_rev = Integer.parseInt(n_strRev);
        if (isPrime.isPrime(n_rev)) return true;
        return false;
    }

    public void Bai7(int N) {
        int flag = 0;
        for (int i = 2; i < N; i++) {
            if (isEmirp(i)) {
                System.out.println(i);
                flag = 1;
            }
        }
        if (flag == 0) System.out.println("Không tìm thấy số Emirp");
    }
}
