package thuattoan;

public class GCD {
//    public int GCD(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }

    public int GCD(int a, int b) {
        int A = a, B = b;

        int R;
        while (B > 0) {
            R = A % B;
            A = B;
            B = R;
        }
        return A;
    }
}
