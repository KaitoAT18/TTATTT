package thuattoan;

public class Carmichael {
    public boolean isCarmichael(int n) {
        isPrime isPrime = new isPrime();
        SMWI smwi = new SMWI();
        GCD gcd = new GCD();

        if (isPrime.isPrime(n)) return false;

        for (int i = 2; i < n; i++) {
            if (gcd.GCD(i, n) == 1) {
                if (smwi.SMWI(i, n-1, n) != 1){
                    return false;
                }
            }
        }
        return true;
    }
}
