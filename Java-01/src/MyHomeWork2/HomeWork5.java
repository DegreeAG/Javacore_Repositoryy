package MyHomeWork2;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số cần kiểm tra: ");
        int n = new Scanner(System.in).nextInt();

        int reversedNumber = 0;
        int S = n;
        while (S > 0) {
            int number = S % 10;
            reversedNumber = reversedNumber * 10 + number;
            S /= 10;

        }
        if (n == reversedNumber) {
            System.out.println(n + " là số thuận nghịch.");
        } else {
            System.out.println(n + " không phải là số thuận nghịch");
        }
    }
}
