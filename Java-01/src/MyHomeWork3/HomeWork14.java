package MyHomeWork3;

import java.util.Scanner;

public class HomeWork14 {

    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        double sum = tong(n);
        System.out.println("Tổng S = " + sum);

    }

    public static double tong (int n) {
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += 1.0 / i;
        }
        return S;
    }
}
