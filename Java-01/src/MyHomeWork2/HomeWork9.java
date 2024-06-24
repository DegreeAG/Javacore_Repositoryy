package MyHomeWork2;

import java.util.Scanner;

public class HomeWork9 {

    public static void main(String[] args) {
        System.out.println("Nhập vào chiều cao h của tam giác vuông: ");
        int h = new Scanner(System.in).nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }

    }
}
