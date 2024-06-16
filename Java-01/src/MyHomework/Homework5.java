package MyHomework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất");
        int sntn = a1.nextInt();
        System.out.println("Nhập số nguyên thứ hai");
        int snth = a1.nextInt();
        float kq = (float)sntn/snth;
        long kqpc = (long)(kq*1000);
        System.out.println("Thương của 2 số nguyên trên là " + ((float)kqpc/1000));
    }
}
