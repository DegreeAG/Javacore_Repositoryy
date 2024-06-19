package MyHomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nguyên cần tìm ước số: ");
        int n = new Scanner(System.in).nextInt();
        int i;
        int count = 0;
        System.out.printf("Các ước số của số " + n + " là: ");
        for  (i = 1; i <= n; i++) ;
          if (n % i == 0);
        System.out.println(i +"");
        count++;
        System.out.println("Số lượng ước số là: " + count);
    }
}
