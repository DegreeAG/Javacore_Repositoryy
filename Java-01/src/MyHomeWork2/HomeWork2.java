package MyHomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        System.out.println("Các ước số của " + n + "là: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                S++;
                System.out.println(i + "");
            }
        }
            System.out.println("Số lượng ước số của " + n + " là: " + S);
    }
}
