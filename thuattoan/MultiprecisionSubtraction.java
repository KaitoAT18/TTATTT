package thuattoan;

public class MultiprecisionSubtraction {
    public int[]  multiprecisionSubtraction(int a, int b, int w, int p) {
        IntToArray intToArray = new IntToArray();

        int[] arrA = intToArray.intToArray(p, w, a);
        int[] arrB = intToArray.intToArray(p, w, b);

        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] arrC = new int[t+1];

        int epsilon = 0;

        for (int i = t-1; i >= 0; i--) {
            arrC[i] = arrA[i] - arrB[i] - epsilon;
            if (arrC[i] < 0) {
                epsilon = 1;
                arrC[i] += (int) Math.pow(2, w);
            }else{
                epsilon = 0;
            }
        }
        arrC[t] = epsilon;
        return arrC;
    }

    public int[] multiprecisionSubtraction(int[] a, int[] b, int w, int p) {
        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] arrC = new int[t+1];

        int epsilon = 0;

        for (int i = t-1; i >= 0; i--) {
            arrC[i] = a[i] - b[i] - epsilon;
            if (arrC[i] < 0) {
                epsilon = 1;
                arrC[i] += (int) Math.pow(2, w);
            }else{
                epsilon = 0;
            }
        }
        arrC[t] = epsilon;
        return arrC;
    }
}
