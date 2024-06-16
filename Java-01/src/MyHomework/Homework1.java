package MyHomework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Nhập chiều rộng hình chữ nhật");
        Scanner cr = new Scanner(System.in);
        int soNguyen1 = cr.nextInt();
        System.out.println("Nhập chiều dài hình chữ nhật");
        int soNguyen2 = cr.nextInt();
        System.out.println("Chu vi của hình chữ nhật là " + (soNguyen1 * 2 + soNguyen2 * 2));
        System.out.println("Diện tích của hình chữ nhật là " + (soNguyen1 * soNguyen2));

    }
}
