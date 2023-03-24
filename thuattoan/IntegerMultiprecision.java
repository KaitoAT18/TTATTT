package thuattoan;

public class IntegerMultiprecision {
    public int[] decimalToBinary(int decimal, int w) {
        int[] binary = new int[w];
        int index = w - 1;

        while (decimal > 0 && index >= 0) {
            binary[index--] = decimal % 2;
            decimal /= 2;
        }
        return binary;
    }

    public int U(int UV, int w) {
        int[] binary = decimalToBinary(UV, w);
        int decimal = 0;
        for (int i = (w/2)-1; i >= 0; i--) {
            decimal += binary[i]*Math.pow(2, (w/2)-i-1);
        }
        return decimal;
    }

    public int V(int UV, int w) {
        int[] binary = decimalToBinary(UV, w);
        int decimal = 0;
        for (int i = w-1; i >= (w/2); i--) {
            decimal += binary[i]*Math.pow(2, w-i-1);
        }
        return decimal;
    }

    public int[] IntegerMultiprecision(int a, int b, int w, int p) {
        IntToArray ita = new IntToArray();

        int[] A = ita.intToArray(p,w,a);
        int[] B = ita.intToArray(p,w,b);

        int m = (int) Math.ceil((Math.log(p) / Math.log(2)));
        int t = (int) Math.ceil((double) m/w);

        int[] C = new int[w];
        for (int i = 0; i < t; i++) {
            C[i] = 0;
        }

        int U, UV, V;
        for (int i = 0; i < t; i++) {
            U = 0;
            for (int j = 0; j < t; j++) {
                UV = C[i+j] + A[t-i-1]*B[t-j-1] + U;
                U = U(UV,2*w);
                V = V(UV,2*w);
                C[i+j] = V;
            }
            C[i+t] = U;
        }
        int[] C_reverse = new int[w];
        for (int i = C.length-1; i >=0; i--) {
            C_reverse[w-i-1] = C[i];
        }
        return C_reverse;
    }
}
