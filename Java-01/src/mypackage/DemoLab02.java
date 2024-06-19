package mypackage;

import java.util.Scanner;

public class DemoLab02 {
    public static void main(String[] args) {
        Scanner soNguyen = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất");
        int soThu1 = soNguyen.nextInt();
        System.out.println("Nhập số thứ hai");
        int soThu2 = soNguyen.nextInt();
        System.out.println("Nhập số thứ ba");
        int soThu3 = soNguyen.nextInt();
        int soLonNhat = soThu1;
        if (soThu2 > soLonNhat) {
            soLonNhat = soThu2;
        }
        if (soThu3 > soLonNhat) {
            soLonNhat = soThu3;
        }
        System.out.println("Số lớn nhất trong 3 số trên là " + soLonNhat);


    }


}
