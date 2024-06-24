package MyHomeWork2;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {

        System.out.println("Nhập vào chiều cao n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào chiều dài m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
