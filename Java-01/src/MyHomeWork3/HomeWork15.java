package MyHomeWork3;

import java.util.Scanner;

public class HomeWork15 {


    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int sum = ketQua(n);
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " và chia hết cho 7 là: " + sum);


    }

    public static int ketQua (int n) {
        int S = 0;
        for (int i = 7; i <= n; i += 7) {
            S += i;
        }
        return S;
    }
}
