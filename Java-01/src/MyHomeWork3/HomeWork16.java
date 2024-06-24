package MyHomeWork3;

import java.util.Scanner;

public class HomeWork16 {

    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số chẵn nhỏ hơn " + n + ": " + evenNumber(n));
        System.out.println("Các số lẻ nhỏ hơn " + n + ": " + oddNumber(n));
    }

    public static int evenNumber(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return n;
    }

    public static int oddNumber(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return n;
    }
}
