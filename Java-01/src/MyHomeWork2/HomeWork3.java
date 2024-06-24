package MyHomeWork2;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên dương a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số nguyên dương b: ");
        int b = new Scanner(System.in).nextInt();
        int uocChung = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i ==0 && b % i ==0) {
                uocChung = i;
            }
        }
        System.out.println("Ước chung lớn nhất của hai số " + a + " và " + b + "là: " + uocChung);
        System.out.println("Bội chung lớn nhất của hai số " + a + " và " + b + "là: " + (a*b)/ uocChung);
    }
}
