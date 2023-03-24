package thuattoan;

public class CountPrime {
    public int countPrime(int n) {
        isPrime isPrime = new isPrime();

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime.isPrime(i)) count++;
        }
        return count;
    }
}
