package Chuong1.src;

import thuattoan.Fermat;

public class Bai34 {
    public boolean isPrime(int n, int t) {
        Fermat fermat = new Fermat();

        if (fermat.Fermat(n, t)) return true;
        return false;
    }
}
