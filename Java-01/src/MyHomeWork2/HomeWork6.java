package MyHomeWork2;

import java.util.Scanner;

public class HomeWork6 {


    public static void main(String[] args) {
        System.out.println("Nhập một số nguyên dương bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        n = Math.abs(n);
        do {
            if (n > 0) {
                int i = n % 10;
                S += i;
                n /= 10;
            }

        }   while (n>0);
        System.out.println("Tổng các chữ số là: " + S);
    }

}

