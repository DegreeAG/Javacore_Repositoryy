package mypackage;

import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
        System.out.println("Nhập số thứ nhất: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhập số thứ hai: ");
        int y = new Scanner(System.in).nextInt();
        sum1(x, y);
        int ketQua = sum2(x, y);
        System.out.println("Kết quả khi gọi hàm sum2: " + ketQua);
        System.out.println("Xong");
    }

    public static void sum1 (int a, int b ) {
        int c = a + b;
        System.out.println(c);

    }
    public static int sum2 (int a, int b ) {
        int c = a - b;
        System.out.println(c);
        return c;
    }
}
