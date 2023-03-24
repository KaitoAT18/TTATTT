package thuattoan;
import java.util.Random;

public class Fermat {
    //Check Prime Number
    SMWI smwi = new SMWI();
    Random random = new Random();
    public boolean Fermat(int n, int t) {
        for (int i = 1; i <= t; i++) {
            int a = random.nextInt(n-3) + 2;
            int r = smwi.SMWI(a, n-1, n);
            if (r != 1) return false;
        }
        return true;
    }
}