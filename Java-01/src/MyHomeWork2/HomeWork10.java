package MyHomeWork2;

import java.util.Scanner;

public class HomeWork10 {

    public static void main(String[] args) {
        System.out.println("Nhập chiều cao h của tam giác: ");
        int h = new Scanner(System.in).nextInt();
        int i;
        for ( i = 1; i <= h; i++) {
            for (int j = 1; j <= h-1; j++) {
                System.out.print(" ");
            }
        }
        for (int k = 2; k <= i; k++) {

            System.out.print("* ");
       }
        System.out.println();
    }
}
