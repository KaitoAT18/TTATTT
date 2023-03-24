package thuattoan;

public class SMWI {
    //Squared Multiplication with Iteration
    public int SMWI(int a, int k, int n) {
        double b = 1;
        if (k == 0) {
            return (int)b;
        }

        //Đổi nhị phân

        //Đếm phần tử trong mảng
        int count = 0;
        int temp = k;
        while (temp > 0) {
            temp /= 2;
            count++;
        }

        //Thêm phần tử vào mảng
        int len = 0;
        int[] arr = new int[count];
        while (k > 0) {
            arr[len] = k%2;
            k/=2;
            len++;
        }

        double A = a;
        if (arr[0] == 1) {
            b = a;
        }

        for (int i = 1; i < arr.length; i++) {
            A = (Math.pow(A, 2)) % n;
            if (arr[i] == 1) {
                b = (A*b) % n;
            }
        }
        return (int)b;
    }
}
