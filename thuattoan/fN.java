package thuattoan;

public class fN {
    public int fN(int n) {
        isPrime isPrime = new isPrime();

        int F;
        if (isPrime.isPrime(n)) {
            F = n;
        }else{
            F = 0;
        }
        return F;
    }
}
