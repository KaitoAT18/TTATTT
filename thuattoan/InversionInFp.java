package thuattoan;

public class InversionInFp {
    //Using the extented Euclide alogrithm
    public int inversionInFp(int p, int a) {
        int u = a, v = p;
        int x1 = 1, x2 = 0;

        int q,r,x;
        while (u != 1) {
            //3.1
            q = v/u;
            r = v-q*u;
            x = x2-q*x1;
            //3.2
            v = u;
            u = r;
            x2 = x1;
            x1 = x;
        }
        int result = x1 % p;
        while (result < 0) result += p;
        return result;                  //a^-1 mod p
    }
}
