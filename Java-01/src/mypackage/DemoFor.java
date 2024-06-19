package mypackage;

import java.util.Scanner;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n = new Scanner(System.in).nextInt();

        int s = 0;
        for (int i=1; i <=10; i++) {
            s=s+i;
        }
        System.out.println("Kết quả: " + s);
    }
}
