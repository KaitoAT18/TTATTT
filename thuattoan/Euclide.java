package thuattoan;

public class Euclide {
    public int[] ExtendedEuclide(int a, int b) {
        int[] arr = new int[3];
        int d = a, x = 1, y = 0;

        if (b == 0) {
            arr[0] = d;
            arr[1] = 1;
            arr[2] = 0;
        }

        int x2 = 1, x1 = 0, y2 = 0, y1 = 1;
        int q, r;
        while (b > 0) {
            //3.1
            q = a/b;
            r = a - q*b;
            x = x2 - q*x1;
            y = y2 - q*y1;
            //3.2
            a = b;
            b = r;
            x2 = x1;
            x1 = x;
            y2 = y1;
            y1 = y;
        }
        d = a;
        x = x2;
        y = y2;

        arr[0] = d;
        arr[1] = x;
        arr[2] = y;

        return arr;
    }
}
