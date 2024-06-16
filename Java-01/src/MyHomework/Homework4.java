package MyHomework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Nhập số dương bất kì");
        Scanner b = new  Scanner(System.in);
        double cbh = Math.sqrt(b.nextInt()); // Số nguyên b
        long cbhsn = (long)(cbh*1000);
        System.out.println("Căn bậc 2 của số trên là " + ((float)cbhsn/1000));
    }
}
