package Chuong1.src;

public class Bai6 {
    //Hai số thân thiết
    public boolean isAmicableNumbers(int n, int m) {
        //Tìm tổng các ước của n
        int sum_dn = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum_dn += i;
            }
        }
        //Tìm tổng các ước của m
        int sum_dm = 0;
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sum_dm += i;
            }
        }

        if (sum_dm == n && sum_dn == m) {
            return true;
        }
        return false;
    }
    public void AmicableNumbers(int N) {
        for (int i = 1; i < N; i++) {
            for(int j = i+1; j <= N; j++) {
                if (isAmicableNumbers(i,j)) System.out.println("[" + i + ", " + j + "]");
            }
        }
    }
}
