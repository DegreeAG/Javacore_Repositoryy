package MyHomeWork3;

import java.util.Scanner;

public class HomeWork17 {


    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();


    }

    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
