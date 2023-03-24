package thuattoan;

public class IntToArray {
    public int[] intToArray(int p, int w, int a) {
        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] arr = new int[t];

        for (int i = t-1; i >= 0; i--) {
            arr[i] = a % (int)Math.pow(2, w);
            a = a / (int) Math.pow(2, w);
        }
        return arr;
    }
}
