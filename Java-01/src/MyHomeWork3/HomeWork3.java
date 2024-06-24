package MyHomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
    }

    public static int[] inputArray(int n, Scanner scanner) {
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        return array;

    }
}