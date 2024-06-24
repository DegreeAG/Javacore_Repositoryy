package MyHomeWork3;

public class HomeWork2 {

    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (primeNumber(i) && allDigitNumberPrime(i) && reversedNumber(i)) {
                System.out.println(i);
            }
        }

    }


    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static  boolean allDigitNumberPrime (int n) {
        while (n > 0) {
            int digitNumber = n % 10;
            if (!allDigitNumberPrime(digitNumber)) {
                return false;
            }
            n /= 10;
        }
        return true;

    }

    public static boolean reversedNumber (int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return n == reversed;
    }

}
