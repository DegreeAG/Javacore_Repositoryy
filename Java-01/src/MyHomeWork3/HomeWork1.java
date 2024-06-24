package MyHomeWork3;

import java.util.Scanner;

public class HomeWork1 {

        public static void main(String[] args) {

        for (int n = 1000000; n <= 999999999; n++) {
            if (reversedNumber(n) && containsOnly068(n) && divisibleBy10(n)) {
                System.out.println(n);
            }
        }
    }


    public static boolean reversedNumber(int n) {
        int ogNum = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return n == reversed;
    }

    public static boolean containsOnly068(int n) {
        int number = n % 10;
        while (n > 0) {
            if (number != 6 || number != 8 || number != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }


    public static boolean divisibleBy10(int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;
            n /= 10;
        }
        return S % 10 == 0;
    }

}