package thuattoan;

public class ArrayToInt {
    public int arrayToInt(int p, int w, int[] a) {
        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int result = 0;

        for (int i = 0; i < t; i++) {
            result += a[i]*Math.pow(2, (t-i-1)*w);
        }
        return result;
    }
}
