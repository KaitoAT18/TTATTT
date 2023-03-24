package thuattoan;

public class InFp {
    public int[] addition(int p, int w, int a, int b) {
        MultiprecisionAddition mA = new MultiprecisionAddition();
        MultiprecisionSubtraction mS = new MultiprecisionSubtraction();
        IntToArray ita = new IntToArray();

        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] c_arr = mA.multiprecisionAddition(a, b, w, p);
        int[] p_arr = ita.intToArray(p, w, p);

        boolean check = false;
        for (int i = 0; i < t; i++) {
            if (c_arr[i] >= p_arr[i]) check = true;
        }
        if (c_arr[t] == 1) {
            c_arr = mS.multiprecisionSubtraction(c_arr, p_arr, w, p);
        } else if (check){
            c_arr = mS.multiprecisionSubtraction(c_arr, p_arr, w, p);
        }
        return c_arr;
    }

    public int[] subtraction(int p, int w, int a, int b) {
        MultiprecisionAddition mA = new MultiprecisionAddition();
        MultiprecisionSubtraction mS = new MultiprecisionSubtraction();
        IntToArray ita = new IntToArray();

        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] c_arr = mS.multiprecisionSubtraction(a, b, w, p);
        int[] p_arr = ita.intToArray(p, w, p);

        if (c_arr[t] == 1) {
            c_arr = mA.multiprecisionAddition(c_arr, p_arr, w, p);
        }
        return c_arr;
    }
}
