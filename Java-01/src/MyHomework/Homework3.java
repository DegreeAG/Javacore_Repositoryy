package MyHomework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int soThu1 = a.nextInt();
        System.out.println("Nhập số thứ hai");
        int soThu2 = a.nextInt();
        System.out.println("Nhập số thứ ba");
        int soThu3 = a.nextInt();
        System.out.println("Nhập số thứ tư");
        int soThu4 = a.nextInt();
        int soLonNhat = soThu1;
        if (soThu2 > soLonNhat) {
            soLonNhat = soThu2;
        }
        if (soThu3 > soLonNhat) {
            soLonNhat = soThu3;
        }
        if (soThu4 > soLonNhat) {
            soLonNhat = soThu4;
        }

        System.out.println("Số lớn nhất trong 4 số trên là " + soLonNhat);

    }
}
