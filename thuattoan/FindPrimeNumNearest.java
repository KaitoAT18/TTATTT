package thuattoan;

public class FindPrimeNumNearest {
    public int NearestNum(int k) {
        Eratosthenes eratosthenes = new Eratosthenes();

        //Khai báo 2 biến temp1, temp2 để gán giá trị của k
        //Mảng primes để lưu 2 số nguyên tố gần nhất với k
        int temp1 = k;
        int temp2 = k;
        int[] primes = new int[2];

        //Tìm số nguyên tố gần nhất lớn hơn k
        while (true) {
            if (eratosthenes.isPrime(temp1)) {
                primes[0] = temp1;
                break;
            }
            temp1++;
        }

        //Tìm số nguyên tố gần nhất nhỏ hơn k
        while (true) {
            if (eratosthenes.isPrime(temp2)) {
                primes[1] = temp2;
                break;
            }
            temp2--;
        }

        //Trả về kết quả
        return (primes[0] - k) >= (k - primes[1]) ? primes[1] : primes[0];
    }
}
