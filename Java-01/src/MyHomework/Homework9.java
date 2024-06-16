package MyHomework;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner ntns = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn: ");
        int ngaySinh = ntns.nextInt();
        LocalDate now = LocalDate.now();
        int yearBirth = now.getYear();
        System.out.println("Số tuổi của bạn là " + (yearBirth - (ngaySinh)));

    }
}
