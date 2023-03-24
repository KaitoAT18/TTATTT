package Chuong1.src;

public class Bai8 {
    //Đếm số ước của n
    public int count(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }
    //Kiểm tra số T-Prime (Đúng 3 ước nguyên dương)
    public boolean TPrime(int n) {
        if (count(n) == 3) return true;
        return false;
    }
    //In ra kết quả
    public void Bai8(int N) {
        for (int i = 2; i <= N; i++) {
            if (TPrime(i)) System.out.println(i);
        }
    }
}
