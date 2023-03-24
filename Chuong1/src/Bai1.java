package Chuong1.src;

public class Bai1 {
    //Đếm số ước của n
    public int count(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }
    //Kiểm tra số Q-prime (Số có đúng 4 ước nguyên dương)
    public boolean QPrime(int n) {
        if (count(n) == 4) return true;
        return false;
    }
    public void Bai1(int N) {
        for (int i = 2; i <= N; i++) {
            if (QPrime(i)) System.out.println(i);
        }
    }
}
