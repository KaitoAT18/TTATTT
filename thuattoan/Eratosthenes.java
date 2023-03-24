package thuattoan;
public class Eratosthenes {
    public boolean isPrime(int n) {
        boolean[] mark = new boolean[n+1];
        if (n <= 1) return false;
        int a = 2;
        while (true) {
            if (a*a > n) break;
            int p = a*a;
            while (p <= n) {
                mark[p] = true;
                p += a;
            }
            a++;
            while (a <= n && mark[a]) a++;
            if (a > n) break;
        }
        return (mark[n]) ? false : true;
    }
}
