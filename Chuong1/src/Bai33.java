package Chuong1.src;

import thuattoan.TwoArrays;

public class Bai33 {
    //Hàm chia hai đa thức
    public TwoArrays PolynomialDivision(int[] a, int[] b) {
        int t, x, degree;
        int a_degree = a.length-1;
        int b_degree = b.length-1;
        int[] c = new int[a_degree-b_degree+1];                 //Mảng lưu kết quả phép chia
        while (a_degree >= b_degree) {
            degree = a_degree - b_degree;
            x = a[a_degree] / b[b_degree];
            c[degree] = x;
            for (int i = b_degree; i >= 0; i--) {
                t = degree + i;
                a[t] = (a[t] + b[i] * x) % 2;
            }
            while (a[a_degree] == 0) {
                if (a_degree == 0) break;
                a_degree--;
            }
            if (a_degree == 0) a_degree--;
        }
        int[] r = new int[a.length];
        int[] newC = new int[c.length];
        int k = 0, l = 0;
        for (int i = a.length-1; i >= 0; i--) r[k++] = a[i];
        for (int i = c.length-1; i >= 0; i--) newC[l++] = c[i];
        r = replace(r);
        TwoArrays result = new TwoArrays(newC,r);
        return result;
    }

    //Hàm nhân 2 đa thức
    public int[] PolynomialMultiplication(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n - 1];           //Bậc = length-1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i + j] += a[i] * b[j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = Math.abs(c[i] % 2);
        }
        int[] g = {1,1,0,1};

        if (c.length == g.length) {
            c = replace(c);
        }

        if (c.length >= g.length) {
            int[] r = PolynomialDivision(c, g).getArr2();
            return r;
        }
        return c;
    }

    //Hàm trừ hai đa thức
    public int[] PolynomialSubtraction(int[] a, int[] b) {
        int[] c = new int[b.length];
        int newLength = a.length;
        if (a.length < b.length) {
            newLength = b.length;
        }
        int[] newA = new int[newLength];
        int k = newA.length-1;
        for (int i = 0; i < a.length; i++) {
            newA[k--] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i] = Math.abs(newA[i]-b[i])%2;
        }
        return c;
    }

    //Hàm so sánh b với 0
    public boolean compareWithZero(int[] b) {
        int count = 0;
        for (int x: b) {
            if (x <= 0) {
                count++;
            }
        }
        if (count == b.length) return true;
        return false;
    }

    //Thu gọn mảng
    public int[] replace(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                index = i;
                break;
            }
        }
        int[] a_replace = new int[a.length-index];
        for (int i = a_replace.length-1; i >= 0; i--) a_replace[i] = a[index++];
        return a_replace;
    }

    public int[] ExtendedEuclide(int[] a, int[] b) {
        int[] d = a;
        int[] x = {1};
        int[] y = {0};

        if (compareWithZero(b)) {
            return x;
        }

        int[] x2 = {1};
        int[] x1 = {0};
        int[] y2 = {0};
        int[] y1 = {1};

        int[] q;
        int[] r;

        int step = 0;
        while (!compareWithZero(b)) {
            //3.1
//            System.out.println("step = " + ++step);
            q = PolynomialDivision(a,b).getArr1();
//            System.out.println("q = " + Arrays.toString(q));
            r = PolynomialDivision(a,b).getArr2();
//            System.out.println("r = " + Arrays.toString(r));
            x = PolynomialSubtraction(x2, PolynomialMultiplication(q,x1));
//            x = replace(x);
//            System.out.println("x = " + Arrays.toString(x));
            y = PolynomialSubtraction(y2, PolynomialMultiplication(q,y1));
//            System.out.println("y = " + Arrays.toString(y));
            //3.2
            a = b;
//            System.out.println("a = " + Arrays.toString(a));
            b = r;
//            System.out.println("b = " + Arrays.toString(b));
            x2 = x1;
//            System.out.println("x2 = " + Arrays.toString(x2));
            x1 = x;
//            System.out.println("x1 = " + Arrays.toString(x1));
            y2 = y1;
//            System.out.println("y2 = " + Arrays.toString(y2));
            y1 = y;
//            System.out.println("y1 = " + Arrays.toString(y1));
        }
        d = a;
        x = x2;
        y = y2;

        return y;
    }
}

//Main

/*
        Bai33 bai33 = new Bai33();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập bậc của đa thức A: ");
        int n = input.nextInt();
        System.out.print("Nhập bậc của đa thức B: ");
        int m = input.nextInt();

        int[] a = new int[n+1];
        System.out.println("Nhập hệ số của A: ");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print("x^" + i + " = " );
            a[i] = input.nextInt();
        }
        int[] b = new int[m+1];
        System.out.println("Nhập hệ số của B: ");
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print("x^" + i + " = " );
            b[i] = input.nextInt();
        }

        int[] result = bai33.ExtendedEuclide(a,b);
        System.out.println("Result = " + Arrays.toString(result));
*/